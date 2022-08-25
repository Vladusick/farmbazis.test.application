const button = document.querySelector('.button')
let node = document.getElementById('table');

function clearFunction() {
    node.innerHTML = '';
}

function test() {

    let id = document.getElementById('id').value;
    let request = "http://localhost:8080/api/v1/examples/test/" + id;

    if (id <= 0 || id >= 5 || id == null) {
        alert("Введите значение id чека в диапазоне от 1 до 5");
    }
    else {
        fetch(request)
            .then(Response => Response.json())
            .then(json => data(json));

        const data = (json) => {
            getTableHeader(Object.keys(json[0]));
            getTableData(json);
        };

        const getTableHeader = fields => {
            const table = document.querySelector(".table");
            const thead = document.createElement("thead");
            const tr = document.createElement("tr");
            const fragment = document.createDocumentFragment();
            fields.forEach(element => {
                const th = document.createElement("th");
                th.innerText = element;
                th.scope = "col";
                fragment.appendChild(th);
            });
            tr.appendChild(fragment);
            thead.appendChild(tr);
            table.appendChild(thead);
        };

        const getTableData = data => {
            console.log(data);
            const table = document.querySelector(".table");
            const tbody = document.createElement("tbody");
            data.forEach(x => {
                const tr = document.createElement("tr");
                const fragment = document.createDocumentFragment();
                const keys = Object.keys(data[0]);
                keys.forEach(y => {
                    let td = undefined;
                    if (y === "id") {
                        td = document.createElement("th");
                        td.scope = "row";
                    } else {
                        td = document.createElement("td");
                    }
                    td.innerText = x[y];
                    fragment.appendChild(td);
                });
                tr.appendChild(fragment);
                tbody.appendChild(tr);
                table.appendChild(tbody);
            })
        };
    }
};

button.addEventListener('click', test);
button.addEventListener('click', clearFunction);