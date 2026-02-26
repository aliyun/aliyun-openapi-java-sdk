/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds_data.model.v20220330;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExecuteStatementRequest extends RpcAcsRequest<ExecuteStatementResponse> {
	   

	private Boolean includeResultMetadata;

	private String formatRecordsAs;

	private String transactionId;

	private String sql;

	@SerializedName("resultSetOptions")
	private ResultSetOptions resultSetOptions;

	private String database;

	private String resourceArn;

	@SerializedName("parameters")
	private List<Parameters> parameters;

	private Boolean continueAfterTimeout;

	private String secretArn;
	public ExecuteStatementRequest() {
		super("rds-data", "2022-03-30", "ExecuteStatement");
		setMethod(MethodType.POST);
	}

	public Boolean getIncludeResultMetadata() {
		return this.includeResultMetadata;
	}

	public void setIncludeResultMetadata(Boolean includeResultMetadata) {
		this.includeResultMetadata = includeResultMetadata;
		if(includeResultMetadata != null){
			putBodyParameter("IncludeResultMetadata", includeResultMetadata.toString());
		}
	}

	public String getFormatRecordsAs() {
		return this.formatRecordsAs;
	}

	public void setFormatRecordsAs(String formatRecordsAs) {
		this.formatRecordsAs = formatRecordsAs;
		if(formatRecordsAs != null){
			putBodyParameter("FormatRecordsAs", formatRecordsAs);
		}
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		if(transactionId != null){
			putBodyParameter("TransactionId", transactionId);
		}
	}

	public String getSql() {
		return this.sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
		if(sql != null){
			putBodyParameter("Sql", sql);
		}
	}

	public ResultSetOptions getResultSetOptions() {
		return this.resultSetOptions;
	}

	public void setResultSetOptions(ResultSetOptions resultSetOptions) {
		this.resultSetOptions = resultSetOptions;	
		if (resultSetOptions != null) {
			putBodyParameter("ResultSetOptions" , new Gson().toJson(resultSetOptions));
		}	
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
		if(database != null){
			putBodyParameter("Database", database);
		}
	}

	public String getResourceArn() {
		return this.resourceArn;
	}

	public void setResourceArn(String resourceArn) {
		this.resourceArn = resourceArn;
		if(resourceArn != null){
			putBodyParameter("ResourceArn", resourceArn);
		}
	}

	public List<Parameters> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putBodyParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public Boolean getContinueAfterTimeout() {
		return this.continueAfterTimeout;
	}

	public void setContinueAfterTimeout(Boolean continueAfterTimeout) {
		this.continueAfterTimeout = continueAfterTimeout;
		if(continueAfterTimeout != null){
			putBodyParameter("ContinueAfterTimeout", continueAfterTimeout.toString());
		}
	}

	public String getSecretArn() {
		return this.secretArn;
	}

	public void setSecretArn(String secretArn) {
		this.secretArn = secretArn;
		if(secretArn != null){
			putBodyParameter("SecretArn", secretArn);
		}
	}

	public static class ResultSetOptions {

		@SerializedName("DecimalReturnType")
		private String decimalReturnType;

		@SerializedName("LongReturnType")
		private String longReturnType;

		public String getDecimalReturnType() {
			return this.decimalReturnType;
		}

		public void setDecimalReturnType(String decimalReturnType) {
			this.decimalReturnType = decimalReturnType;
		}

		public String getLongReturnType() {
			return this.longReturnType;
		}

		public void setLongReturnType(String longReturnType) {
			this.longReturnType = longReturnType;
		}
	}

	public static class Parameters {

		@SerializedName("Name")
		private String name;

		@SerializedName("TypeHint")
		private String typeHint;

		@SerializedName("Value")
		private Value value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTypeHint() {
			return this.typeHint;
		}

		public void setTypeHint(String typeHint) {
			this.typeHint = typeHint;
		}

		public Value getValue() {
			return this.value;
		}

		public void setValue(Value value) {
			this.value = value;
		}

		public static class Value {

			@SerializedName("ArrayValue")
			private String arrayValue;

			@SerializedName("BlobValue")
			private String blobValue;

			@SerializedName("BooleanValue")
			private Boolean booleanValue;

			@SerializedName("IsNull")
			private Boolean isNull;

			@SerializedName("LongValue")
			private Long longValue;

			@SerializedName("StringValue")
			private String stringValue;

			public String getArrayValue() {
				return this.arrayValue;
			}

			public void setArrayValue(String arrayValue) {
				this.arrayValue = arrayValue;
			}

			public String getBlobValue() {
				return this.blobValue;
			}

			public void setBlobValue(String blobValue) {
				this.blobValue = blobValue;
			}

			public Boolean getBooleanValue() {
				return this.booleanValue;
			}

			public void setBooleanValue(Boolean booleanValue) {
				this.booleanValue = booleanValue;
			}

			public Boolean getIsNull() {
				return this.isNull;
			}

			public void setIsNull(Boolean isNull) {
				this.isNull = isNull;
			}

			public Long getLongValue() {
				return this.longValue;
			}

			public void setLongValue(Long longValue) {
				this.longValue = longValue;
			}

			public String getStringValue() {
				return this.stringValue;
			}

			public void setStringValue(String stringValue) {
				this.stringValue = stringValue;
			}
		}
	}

	@Override
	public Class<ExecuteStatementResponse> getResponseClass() {
		return ExecuteStatementResponse.class;
	}

}
