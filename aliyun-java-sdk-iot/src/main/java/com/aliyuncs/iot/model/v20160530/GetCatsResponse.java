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
package com.aliyuncs.iot.model.v20160530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160530.GetCatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCatsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private CatInfo catInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CatInfo getCatInfo() {
		return this.catInfo;
	}

	public void setCatInfo(CatInfo catInfo) {
		this.catInfo = catInfo;
	}

	public static class CatInfo {

		private Long id;

		private String name;

		private Boolean hasChild;

		private List<ChildCat> childs;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getHasChild() {
			return this.hasChild;
		}

		public void setHasChild(Boolean hasChild) {
			this.hasChild = hasChild;
		}

		public List<ChildCat> getChilds() {
			return this.childs;
		}

		public void setChilds(List<ChildCat> childs) {
			this.childs = childs;
		}

		public static class ChildCat {

			private Long id;

			private String name;

			private Boolean hasChild;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getHasChild() {
				return this.hasChild;
			}

			public void setHasChild(Boolean hasChild) {
				this.hasChild = hasChild;
			}
		}
	}

	@Override
	public GetCatsResponse getInstance(UnmarshallerContext context) {
		return	GetCatsResponseUnmarshaller.unmarshall(this, context);
	}
}
