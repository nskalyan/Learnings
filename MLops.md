#### MLops (Machine Learning Operations)

##### **What is MLops?**



In real-world scenarios, building a machine learning model for a specific use case does not completely solve the problem. The model should be easy to access, maintain, monitor, and scale as business requirements grow. It should also be updated whenever new data becomes available or when its performance starts degrading.



So, the complete process of building a machine learning model from scratch, deploying it into a real-time environment, monitoring its performance, and maintaining it throughout its lifecycle is called MLOps (Machine Learning Operations).



##### **What are the steps in MLOps?**



Before answering this question, we should first understand what is required to build a machine learning model. The answer is:



1)A well-defined use case(from both Business perspective and User perspective)

2)Data sources.



Based on these factors, we finalize the overall project architecture. This includes designing the data engineering pipeline (data extraction, preprocessing, validation, and ingestion), selecting the appropriate machine learning model, defining the training and optimization strategy, and planning the deployment and monitoring pipeline.



**Step-1: Data Engineering**



Data Engineering is the foundation of every machine learning project. Even the best model cannot produce good results if the data quality is poor.



This step mainly involves:



1)Collecting data from different data sources such as databases, APIs, files, sensors, or cloud storage.

2)Extracting the required data.

3)Cleaning the data by handling missing values, duplicates, and incorrect records.

4)Performing preprocessing such as encoding categorical variables, feature scaling, and feature engineering.

5)Validating the data to ensure consistency and quality.

6)Ingesting the processed data into the training pipeline.



The output of this step is a clean, structured, and model-ready dataset.



**Step-2: Choosing the Right Model**



After preparing the data, the next step is selecting the appropriate machine learning model based on the problem statement.



For example:



If the target is to predict a numerical value, regression models can be used.

If the target is to classify categories, classification models are suitable.

If no target variable exists, clustering or unsupervised learning models can be considered.



The choice of model depends on factors such as:



1)Dataset size

2)Complexity of relationships

3)Accuracy requirements

4)Computational resources

5)Training time



The goal is to choose a model that balances performance, interpretability, and efficiency.



**Step-3: Training**



Training is the process where the selected model learns patterns from the prepared dataset.



During training:



1)The dataset is usually divided into training, validation, and testing datasets. (In general 70:10:20)

2)The model learns by minimising prediction errors.

3)Multiple training iterations (epochs) are performed.

4)Performance metrics are monitored to evaluate how well the model is learning.



At the end of this step, we obtain a trained model capable of making predictions on unseen data.



**Step-4: Optimizing**



A trained model is rarely perfect in its first attempt. The optimisation step focuses on improving its performance.



This includes:



1)Hyperparameter tuning

2)Feature selection

3)Cross-validation

4)Trying different algorithms (In real world not everything will yield perfect results even though the model is selected by planning we should try and compare for validation and even for performance evaluation)

5)Reducing overfitting or underfitting

6)Improving accuracy, precision, recall, F1-score, or other evaluation metrics as per the use case requirement.(For object counting scenario and specific object identifying scenario the model we use is more or less same but the expected accuaries in the scenario will be different as in first model should identify and differtiate between which requires less object classification accuracy and more of distinguishing the objects is enough ,whereas in the second scenario it should distinguish between objects and identify a particular one)



The objective is to develop a model that performs consistently on both training data and real-world unseen data.



**Step-5: Deployment**



Once the model achieves satisfactory performance, it is deployed so that users or applications can use it in real-world scenarios.



Deployment generally involves:



1)Packaging the trained model.

2)Creating APIs or services for predictions.

3)Deploying on cloud platforms, servers, or edge devices.

4)Integrating with existing applications.

5)Monitoring model performance after deployment.

Retraining and updating the model whenever new data becomes available or model accuracy decreases.



This step ensures that the machine learning model continuously provides value in a production environment.


1.Data Engineering	SQL, Python (Pandas, NumPy), Apache Spark, Kafka, Airflow, Databases (MySQL, PostgreSQL, Snowflake), Cloud Storage (AWS S3, Azure Blob, GCP Storage), ETL/ELT pipelines

2\. Choosing the Right Model	Scikit-learn, TensorFlow, PyTorch, XGBoost, LightGBM, CatBoost, Exploratory Data Analysis (EDA), Feature Engineering, Model Selection techniques

3\. Training	TensorFlow, PyTorch, Scikit-learn, Jupyter Notebook, GPUs/TPUs, MLflow (experiment tracking), Distributed Training, Cross Validation

4\. Optimizing	Hyperparameter Tuning (Grid Search, Random Search, Bayesian Optimization, Optuna), Feature Selection, Regularization, Early Stopping, Model Evaluation Metrics

5\. Deployment	Flask, FastAPI, Docker, Kubernetes, REST APIs, TensorFlow Serving, TorchServe, AWS SageMaker, Azure ML, Google Vertex AI, CI/CD (GitHub Actions, Jenkins), Monitoring (Prometheus, Grafana, MLflow)

