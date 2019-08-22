angular.module('licenseApp', []).controller('UniQLicenseController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseUniQ = function(uniq) {
				$scope.uniq = uniq;
				var url = "/UniQ_License/generateUniqLicense";

				// prepare headers for posting

				var uniq1 = {
					appName : $scope.uniq.appName,
					version : $scope.uniq.version,
					email : $scope.uniq.email,
					city : $scope.uniq.city,
					state : $scope.uniq.state,
					key : $scope.uniq.key,
					country : $scope.uniq.country,
					dateDebut : $scope.uniq.dateDebut,
					dateFin : $scope.uniq.dateFin
				};

				//        
				//        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateUniqLicense",
					data : JSON.stringify($scope.uniq),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseUniq = result;

					},

				});

			};

		} ]).controller('UniQAdministratorController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseAdmin = function(admin) {
				$scope.admin = admin;
				var url = "/UniQ_License/generateAdminLicense";

				// prepare headers for posting

				var uniq1 = {
					appName : $scope.admin.appName,
					module : $scope.admin.module,
					version : $scope.admin.version,
					email : $scope.admin.email,
					city : $scope.admin.city,
					state : $scope.admin.state,
					key : $scope.admin.key,
					country : $scope.admin.country,
					dateDebut : $scope.admin.dateDebut,
					dateFin : $scope.admin.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateAdminLicense",
					data : JSON.stringify($scope.admin),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyAdmin = result;

					},

				});

			};

		} ]).controller('UniQPayableController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicensePayable = function(payable) {
				$scope.payable = payable;
				var url = "/UniQ_License/generateLicensePayable";

				// prepare headers for posting

				var uniq1 = {
					appName : $scope.payable.appName,
					module : $scope.payable.module,
					version : $scope.payable.version,
					email : $scope.payable.email,
					city : $scope.payable.city,
					state : $scope.payable.state,
					key : $scope.payable.key,
					country : $scope.payable.country,
					dateDebut : $scope.payable.dateDebut,
					dateFin : $scope.payable.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicensePayable",
					data : JSON.stringify($scope.payable),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyPayable = result;

					},

				});

			};

		} ]).controller('UniQReceivableController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseReceivable = function(receivable) {
				$scope.receivable = receivable;
				var url = "/UniQ_License/generateLicenseReceivable";

				// prepare headers for posting

				var uniq1 = {
					appName : $scope.receivable.appName,
					module : $scope.receivable.module,
					version : $scope.receivable.version,
					email : $scope.receivable.email,
					city : $scope.receivable.city,
					state : $scope.receivable.state,
					key : $scope.receivable.key,
					country : $scope.receivable.country,
					dateDebut : $scope.receivable.dateDebut,
					dateFin : $scope.receivable.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseReceivable",
					data : JSON.stringify($scope.receivable),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyReceivable = result;

					},

				});

			};

		} ])

.controller('UniQFrameworkController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseFramework = function(framework) {
				$scope.framework = framework;
				var url = "/UniQ_License/generateLicenseFramework";

				// prepare headers for posting

				var uniq1 = {
					appName : $scope.framework.appName,
					module : $scope.framework.module,
					version : $scope.framework.version,
					email : $scope.framework.email,
					city : $scope.framework.city,
					state : $scope.framework.state,
					key : $scope.framework.key,
					country : $scope.framework.country,
					dateDebut : $scope.framework.dateDebut,
					dateFin : $scope.framework.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseFramework",
					data : JSON.stringify($scope.framework),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyFramework = result;

					},

				});

			};

		} ])

.controller('UniQTreasuryController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseTreasury = function(treasury) {
				$scope.treasury = treasury;
				var url = "/UniQ_License/generateLicenseTreasury";
				var uniq1 = {
					appName : $scope.treasury.appName,
					module : $scope.treasury.module,
					version : $scope.treasury.version,
					email : $scope.treasury.email,
					city : $scope.treasury.city,
					state : $scope.treasury.state,
					key : $scope.treasury.key,
					country : $scope.treasury.country,
					dateDebut : $scope.treasury.dateDebut,
					dateFin : $scope.treasury.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseTreasury",
					data : JSON.stringify($scope.treasury),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyTreasury = result;

					},

				});

			};

		} ])


.controller('UniQGeneralController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope. generateLicenseGeneral = function(general) {
				$scope.general = general;
				var url = "/UniQ_License/generateLicenseGeneral";
				var uniq1 = {
					appName : $scope.general.appName,
					module : $scope.general.module,
					version : $scope.general.version,
					email : $scope.general.email,
					city : $scope.general.city,
					state : $scope.general.state,
					key : $scope.general.key,
					country : $scope.general.country,
					dateDebut : $scope.general.dateDebut,
					dateFin : $scope.general.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseGeneral",
					data : JSON.stringify($scope.general),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyGeneral = result;

					},

				});

			};

		} ])
		
		.controller('UniQCostAccountingController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope. generateLicenseAnalytic = function(analytic) {
				$scope.analytic = analytic;
				var url = "/UniQ_License/generateLicenseAnalytic";
				var uniq1 = {
					appName : $scope.analytic.appName,
					module : $scope.analytic.module,
					version : $scope.analytic.version,
					email : $scope.analytic.email,
					city : $scope.analytic.city,
					state : $scope.analytic.state,
					key : $scope.analytic.key,
					country : $scope.analytic.country,
					dateDebut : $scope.analytic.dateDebut,
					dateFin : $scope.analytic.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseAnalytic",
					data : JSON.stringify($scope.analytic),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyAnalytic = result;

					},

				});

			};

		} ])
		
		.controller('UniQFixedAssetController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseFixedAseet = function(fixedAsset) {
				$scope.fixedAsset = fixedAsset;
				var url = "/UniQ_License/generateLicenseFixedAsset";
				var uniq1 = {
					appName : $scope.fixedAsset.appName,
					module : $scope.fixedAsset.module,
					version : $scope.fixedAsset.version,
					email : $scope.fixedAsset.email,
					city : $scope.fixedAsset.city,
					state : $scope.fixedAsset.state,
					key : $scope.fixedAsset.key,
					country : $scope.fixedAsset.country,
					dateDebut : $scope.fixedAsset.dateDebut,
					dateFin : $scope.fixedAsset.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseFixedAsset",
					data : JSON.stringify($scope.fixedAsset),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyFixedAsset = result;

					},

				});

			};

		} ])
		
		
		.controller('UniQAccountingEngineController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseAccountingEngine = function(accountEngine) {
				   
				$scope.accountEngine = accountEngine;
				var url = "/UniQ_License/generateLicenseAccountingE";
				var uniq1 = {
					appName : $scope.accountEngine.appName,
					module : $scope.accountEngine.module,
					version : $scope.accountEngine.version,
					email : $scope.accountEngine.email,
					city : $scope.accountEngine.city,
					state : $scope.accountEngine.state,
					key : $scope.accountEngine.key,
					country : $scope.accountEngine.country,
					dateDebut : $scope.accountEngine.dateDebut,
					dateFin : $scope.accountEngine.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseAccountingE",
					data : JSON.stringify($scope.accountEngine),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyAccountingEngine = result;

					},

				});

			};

		} ])
		
		.controller('UniQPayrollController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicensePayroll = function(payroll) {
				   
				$scope.payroll = payroll;
				var url = "/UniQ_License/generateLicensePayroll";
				var uniq1 = {
					appName : $scope.payroll.appName,
					module : $scope.payroll.module,
					version : $scope.payroll.version,
					email : $scope.payroll.email,
					city : $scope.payroll.city,
					state : $scope.payroll.state,
					key : $scope.payroll.key,
					country : $scope.payroll.country,
					dateDebut : $scope.payroll.dateDebut,
					dateFin : $scope.payroll.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicensePayroll",
					data : JSON.stringify($scope.payroll),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyPayroll = result;

					},

				});

			};

		} ])
		
		.controller('UniQHumanResourceController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseResourceHuman = function(human) {
				   
				$scope.human = human;
				var url = "/UniQ_License/generateLicenseHuman";
				var uniq1 = {
					appName : $scope.human.appName,
					module : $scope.human.module,
					version : $scope.human.version,
					email : $scope.human.email,
					city : $scope.human.city,
					state : $scope.human.state,
					key : $scope.human.key,
					country : $scope.human.country,
					dateDebut : $scope.human.dateDebut,
					dateFin : $scope.human.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseHuman",
					data : JSON.stringify($scope.human),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyhuman = result;

					},

				});

			};

		} ])
		
		
		
		.controller('UniQStockController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseStock = function(stock) {
				   
				$scope.stock = stock;
				var url = "/UniQ_License/generateLicenseStock";
				var uniq1 = {
					appName : $scope.stock.appName,
					module : $scope.stock.module,
					version : $scope.stock.version,
					email : $scope.stock.email,
					city : $scope.stock.city,
					state : $scope.stock.state,
					key : $scope.stock.key,
					country : $scope.stock.country,
					dateDebut : $scope.stock.dateDebut,
					dateFin : $scope.stock.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseStock",
					data : JSON.stringify($scope.stock),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeystock = result;

					},

				});

			};

		} ])
		
			.controller('UniQExpensesController',
		[ '$scope', '$http', '$location', function($scope, $http, $location) {
			$scope.datePattern = '/^(\d{1,2})-(\d{1,2})-(\d{4})$/';
			$scope.generateLicenseExpenses = function(expenses) {
				   
				$scope.expenses = expenses;
				var url = "/UniQ_License/generateLicenseExpenses";
				var uniq1 = {
					appName : $scope.expenses.appName,
					module : $scope.expenses.module,
					version : $scope.expenses.version,
					email : $scope.expenses.email,
					city : $scope.expenses.city,
					state : $scope.expenses.state,
					key : $scope.expenses.key,
					country : $scope.expenses.country,
					dateDebut : $scope.expenses.dateDebut,
					dateFin : $scope.expenses.dateFin
				};

				//	        
				//	        
				// $http({
				// method : 'POST',
				// url : '/generateUniqLicense',
				// data : uniq1,
				//
				// }).success(function(data, status) {
				// alert(status);
				// }).
				// error(function(data, status) {
				// });
				$.ajax({
					type : "POST",
					contentType : 'application/json; charset=utf-8',
					url : "/UniQ_License/generateLicenseExpenses",
					data : JSON.stringify($scope.expenses),
					async : false,
					// Note it is important
					success : function(result) {
						$scope.licenseKeyExpenses = result;

					},

				});

			};

		} ]);