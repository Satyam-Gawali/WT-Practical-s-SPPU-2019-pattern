angular.module('userApp').controller('UserController', function($scope, UserService) {
    $scope.users = UserService.getUsers();
  
    $scope.addUser = function() {
      if ($scope.newUser) {
        UserService.addUser($scope.newUser);
        $scope.newUser = {};
      }
    };
  
    $scope.deleteUser = function(user) {
      UserService.deleteUser(user);
    };
  });
  