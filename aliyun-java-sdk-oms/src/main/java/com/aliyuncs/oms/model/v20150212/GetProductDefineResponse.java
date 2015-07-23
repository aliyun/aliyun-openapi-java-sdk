/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.oms.model.v20150212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oms.transform.v20150212.GetProductDefineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class GetProductDefineResponse extends AcsResponse {

	private String requestId;

	private String productName;

	private String dataType;

	private List<Product> productList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<Product> getProductList() {
		return this.productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public static class Product {

		private String productName;

		private List<Type> typeList;

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public List<Type> getTypeList() {
			return this.typeList;
		}

		public void setTypeList(List<Type> typeList) {
			this.typeList = typeList;
		}

		public static class Type {

			private String dataType;

			private List<String> fields;

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public List<String> getFields() {
				return this.fields;
			}

			public void setFields(List<String> fields) {
				this.fields = fields;
			}
		}
	}

	@Override
	public GetProductDefineResponse getInstance(UnmarshallerContext context) {
		return	GetProductDefineResponseUnmarshaller.unmarshall(this, context);
	}
}
