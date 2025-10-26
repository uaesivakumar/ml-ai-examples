# R example: logistic regression
# Load iris dataset
iris <- datasets::iris
# Use only two classes for binary classification
iris_binary <- subset(iris, Species != "setosa")
iris_binary$Species <- factor(iris_binary$Species)
# Fit logistic regression model
model <- glm(Species ~ ., data = iris_binary, family = binomial())
# Display summary
summary(model)
