angular.module('userApp').factory('UserService', function() {
    var users = [
      { name: 'Satyam', email: 'satyam@gmail.com', role: 'Developer' },
    ];
  
    return {
      getUsers: function() {
        return users;
      },
      addUser: function(user) {
        users.push(user);
      },
      deleteUser: function(user) {
        var index = users.indexOf(user);
        if (index > -1) users.splice(index, 1);
      }
    };
  });
  