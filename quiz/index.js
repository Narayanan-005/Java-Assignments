const quiz1 = 
     [
      {
        "question": "What is the time complexity of searching an element in a binary search tree?",
        "options": ["O(1)", "O(n)", "O(log n)", "O(n log n)"],
        "answer": "O(log n)"
      },
      {
        "question": "Which programming language is primarily used for developing Android apps?",
        "options": ["Java", "Swift", "C#", "Kotlin"],
        "answer": "Java"
      },
      {
        "question": "What is the output of the following code snippet in Python?\n\n```python\nprint(2**3)\n```",
        "options": ["6", "8", "9", "12"],
        "answer": "8"
      },
      {
        "question": "Which of the following is NOT a valid variable name in Python?",
        "options": ["variable1", "_variable", "1_variable", "variable_one"],
        "answer": "1_variable"
      },
      {
        "question": "In HTML, which tag is used to create a hyperlink?",
        "options": ["<a>", "<link>", "<href>", "<hyperlink>"],
        "answer": "<a>"
      },
      {
        "question": "Which of the following is a NoSQL database?",
        "options": ["MySQL", "PostgreSQL", "MongoDB", "SQLite"],
        "answer": "MongoDB"
      },
      {
        "question": "What does CSS stand for?",
        "options": ["Cascading Style Sheets", "Creative Style Sheets", "Computer Style Sheets", "Colorful Style Sheets"],
        "answer": "Cascading Style Sheets"
      },
      {
        "question": "Which keyword is used to create a function in JavaScript?",
        "options": ["def", "func", "function", "lambda"],
        "answer": "function"
      },
      {
        "question": "What is the purpose of the `git init` command?",
        "options": ["To initialize a new Git repository", "To commit changes", "To push changes to a remote repository", "To clone a repository"],
        "answer": "To initialize a new Git repository"
      },
      {
        "question": "Which of the following is a frontend JavaScript framework?",
        "options": ["Django", "Laravel", "React", "Flask"],
        "answer": "React"
      }
    ];
const quiz2 = 
    [
      {
        "question": "What is the time complexity of searching an element in a balanced binary search tree?",
        "options": ["O(1)", "O(log n)", "O(n)", "O(n log n)"],
        "answer": "O(log n)"
      },
      {
        "question": "Which programming language is known as the mother of all languages?",
        "options": ["C", "Python", "Java", "Assembly"],
        "answer": "Assembly"
      },
      {
        "question": "What does SQL stand for?",
        "options": ["Structured Query Language", "Standard Query Language", "Simple Query Language", "Stylish Query Language"],
        "answer": "Structured Query Language"
      },
      {
        "question": "In Python, what is the output of: print(2 ** 3)?",
        "options": ["5", "6", "8", "9"],
        "answer": "8"
      },
      {
        "question": "Which data structure uses LIFO (Last In, First Out) principle?",
        "options": ["Queue", "Stack", "Array", "Linked List"],
        "answer": "Stack"
      },
      {
        "question": "What does the acronym 'API' stand for?",
        "options": ["Application Programming Interface", "Application Process Integration", "Automated Programming Interface", "Application Programming Implementation"],
        "answer": "Application Programming Interface"
      },
      {
        "question": "Which of the following is not a valid variable name in Python?",
        "options": ["my_var", "_myvar", "2myvar", "myVar"],
        "answer": "2myvar"
      },
      {
        "question": "What is the main purpose of the 'finally' block in exception handling?",
        "options": ["To handle exceptions", "To execute code regardless of whether an exception occurs or not", "To execute code only if an exception occurs", "To terminate the program"],
        "answer": "To execute code regardless of whether an exception occurs or not"
      },
      {
        "question": "Which of these is not a relational database?",
        "options": ["MySQL", "MongoDB", "PostgreSQL", "SQLite"],
        "answer": "MongoDB"
      },
      {
        "question": "In Java, which keyword is used to inherit a class?",
        "options": ["inherits", "extends", "implements", "inheritsFrom"],
        "answer": "extends"
      }
    ];

const quiz3 = [
  {
    "question": "What is the output of the following Python code?\n\n```python\ndef func(x, y=[]):\n    y.append(x)\n    return y\n\nprint(func(1))\nprint(func(2, []))\nprint(func(3))\n```\n",
    "options": [
      "[[1], [2], [3]]",
      "[[1], [2], [1, 3]]",
      "[[1], [2], [1]]",
      "[[1], [1, 2], [1, 3]]"
    ],
    "answer": "[[1], [2], [1, 3]]",
    "explanation": "The default mutable argument (list y) retains its state across function calls if not explicitly overridden."
  },
  {
    "question": "What will be the value of `x` after the following code executes?\n\n```python\nx = [1, 2, 3, 4]\nx = x[::-1]\n```\n",
    "options": [
      "[1, 2, 3, 4]",
      "[4, 3, 2, 1]",
      "[1, 3, 2, 4]",
      "[4, 2, 3, 1]"
    ],
    "answer": "[4, 3, 2, 1]",
    "explanation": "The slicing operation `x[::-1]` reverses the list."
  },
  {
    "question": "In JavaScript, what will `console.log(0.1 + 0.2 === 0.3);` output?",
    "options": [
      "true",
      "false",
      "undefined",
      "TypeError"
    ],
    "answer": "false",
    "explanation": "Due to floating-point precision issues, `0.1 + 0.2` does not exactly equal `0.3`."
  },
  {
    "question": "Which of the following SQL queries will retrieve only unique rows from the `customers` table?",
    "options": [
      "SELECT * FROM customers;",
      "SELECT DISTINCT * FROM customers;",
      "SELECT UNIQUE * FROM customers;",
      "SELECT ALL * FROM customers;"
    ],
    "answer": "SELECT DISTINCT * FROM customers;",
    "explanation": "The `DISTINCT` keyword ensures that only unique rows are returned."
  },
  {
    "question": "What does the `finally` block do in a try-except statement in Python?",
    "options": [
      "It executes only if an exception occurs.",
      "It executes only if no exception occurs.",
      "It executes regardless of whether an exception occurs or not.",
      "It prevents the except block from executing."
    ],
    "answer": "It executes regardless of whether an exception occurs or not.",
    "explanation": "The `finally` block is always executed after the try-except block, whether an exception occurred or not."
  },
  {
    "question": "In the context of version control systems, what does the command `git merge` do?",
    "options": [
      "It creates a new branch.",
      "It combines changes from different branches.",
      "It deletes a branch.",
      "It shows the commit history."
    ],
    "answer": "It combines changes from different branches.",
    "explanation": "The `git merge` command is used to integrate changes from different branches into a single branch."
  }
];


const quiz4 = [
  {
      "question": "Which of the following best describes 'memoization' in programming?",
      "options": [
          "A technique to improve the efficiency of recursive algorithms by storing previously computed values.",
          "A process to optimize code execution by pre-compiling code segments.",
          "A debugging method to trace the execution of a program step-by-step.",
          "A way to manage memory allocation dynamically during program execution."
      ],
      "answer": "A technique to improve the efficiency of recursive algorithms by storing previously computed values."
  },
  {
      "question": "In the context of C++ programming, what does the 'explicit' keyword prevent?",
      "options": [
          "Implicit type conversion.",
          "Function overloading.",
          "Inheritance of a class.",
          "Linking of multiple libraries."
      ],
      "answer": "Implicit type conversion."
  },
  {
      "question": "Which of the following is a key characteristic of a pure function in functional programming?",
      "options": [
          "It relies on global variables for its computations.",
          "It has no side effects and returns the same output for the same inputs.",
          "It can modify the state of its input arguments.",
          "It throws exceptions when encountering invalid inputs."
      ],
      "answer": "It has no side effects and returns the same output for the same inputs."
  },
  {
      "question": "What is the time complexity of finding the shortest path in a graph using Dijkstra's algorithm with a binary heap implementation?",
      "options": [
          "O(V + E log V)",
          "O(V^2 + E)",
          "O(E log V)",
          "O(V^2 log E)"
      ],
      "answer": "O(V + E log V)"
  },
  {
      "question": "In Java, what will be the output of the following code?\n\n```java\nclass Test {\n    public static void main(String[] args) {\n        String str = \"Hello\";\n        str = str.concat(\" World\");\n        System.out.println(str);\n    }\n}\n```",
      "options": [
          "Hello",
          "World",
          "Hello World",
          "HelloWorld"
      ],
      "answer": "Hello World"
  },
  {
      "question": "Which of the following regular expressions matches a valid IPv4 address?",
      "options": [
          "\"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$\"",
          "\"^(\\d{1,3}\\.){3}\\d{1,3}$\"",
          "\"^(\\d{1,3}\\.){4}$\"",
          "\"^(\\d{1,3}\\.){3}\\d{1,3}\\.?$\""
      ],
      "answer": "\"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$\""
  },
  {
      "question": "In Python, what does the built-in function 'zip()' do?",
      "options": [
          "Combines two or more iterables element-wise into tuples.",
          "Creates a compressed file of the input data.",
          "Encrypts the input data using the ZIP algorithm.",
          "Sorts the input data in ascending order."
      ],
      "answer": "Combines two or more iterables element-wise into tuples."
  },
  {
      "question": "What is the result of evaluating the expression 3 + 2 * 4 - 5 in most programming languages?",
      "options": [
          "6",
          "11",
          "8",
          "3"
      ],
      "answer": "6"
  },
  {
      "question": "Which of the following statements is true about the 'finally' block in Java exception handling?",
      "options": [
          "It is executed only when an exception is thrown.",
          "It is executed regardless of whether an exception is thrown or not.",
          "It must contain a 'catch' block.",
          "It can only be used with checked exceptions."
      ],
      "answer": "It is executed regardless of whether an exception is thrown or not."
  },
  {
      "question": "In SQL, which of the following commands is used to remove a table from the database?",
      "options": [
          "DROP TABLE",
          "DELETE TABLE",
          "REMOVE TABLE",
          "TRUNCATE TABLE"
      ],
      "answer": "DROP TABLE"
  }
]
;
    
let constant = 1;
let container = document.querySelector(".container");

createQuiz(container,quiz1);

function createQuiz(parent,json){
  let num = 1;
  json.forEach(element => {
    parent.appendChild(createSingleQuiz(parent,element,num++));
  });
  let submit = document.createElement("input");
  submit.setAttribute("type","submit");
  parent.appendChild(submit);
  submit.addEventListener("click",function(){
    let score = 0;
    let ans = document.querySelectorAll('input[class="options"]:checked');
    if(ans.length != json.length){
      alert("Please answer all the questions");
    }else {
      let index = 0;
      for (; index < ans.length; index++) {
        const element = ans[index].value;
        if(element == json[index].answer){
          score++;
        }
      }
      result(parent,score,index);
    }
  })
}
function result(container,score,outof){
  container.classList.remove("container");
  container.classList.add("new");
  container.innerHTML = "";
  let div1 = document.createElement("div");
  div1.classList.add("resutlt");
  div1.innerText = score+"/"+outof;
  container.appendChild(div1);
}

function createSingleQuiz(parent,element,num){
  let container =document.createElement("div");
  container.classList.add("questionContainer");
  let question = document.createElement("div");
  question.innerText=(num+"."+element.question);
  question.classList.add("question");
  question.setAttribute("name",num);
  container.appendChild(question);

  let options = element.options;
  options.forEach(element => {
    let option = document.createElement("input");
    option.setAttribute("type","radio")
    option.setAttribute("name",num);
    option.setAttribute("id",constant);
    option.setAttribute("value",element);
    option.classList.add("options");
    container.appendChild(option);

    let label = document.createElement("label");
    label.innerText=element;
    label.setAttribute("for",constant++);
    container.appendChild(label);
    container.appendChild(document.createElement("br"));
  });
  return container;
}
  
