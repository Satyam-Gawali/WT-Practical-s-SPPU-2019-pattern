angular.module('userApp').directive('userCard', function() {
    return {
      restrict: 'E',
      scope: {
        info: '=',
        onDelete: '&'
      },
      template: `
        <div class="user-card">
          <h3>{{ info.name }}</h3>
          <p><strong>Email:</strong> {{ info.email }}</p>
          <p><strong>Role:</strong> {{ info.role }}</p>
          <button ng-click="onDelete()">Delete</button>
        </div>
      `
    };
  });
  