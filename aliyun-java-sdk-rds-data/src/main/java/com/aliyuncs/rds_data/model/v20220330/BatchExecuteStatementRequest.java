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
public class BatchExecuteStatementRequest extends RpcAcsRequest<BatchExecuteStatementResponse> {
	   

	@SerializedName("parameterSets")
	private List<List<ParameterSetsItem>> parameterSets;

	private String transactionId;

	private String sql;

	private String database;

	private String resourceArn;

	private String secretArn;
	public BatchExecuteStatementRequest() {
		super("rds-data", "2022-03-30", "BatchExecuteStatement");
		setMethod(MethodType.POST);
	}

	public List<List<ParameterSetsItem>> getParameterSets() {
		return this.parameterSets;
	}

	public void setParameterSets(List<List<ParameterSetsItem>> parameterSets) {
		this.parameterSets = parameterSets;	
		if (parameterSets != null) {
			putBodyParameter("ParameterSets" , new Gson().toJson(parameterSets));
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

	public String getSecretArn() {
		return this.secretArn;
	}

	public void setSecretArn(String secretArn) {
		this.secretArn = secretArn;
		if(secretArn != null){
			putBodyParameter("SecretArn", secretArn);
		}
	}

	public static class ParameterSetsItem {

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
	public Class<BatchExecuteStatementResponse> getResponseClass() {
		return BatchExecuteStatementResponse.class;
	}

}
