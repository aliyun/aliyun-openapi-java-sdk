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

package com.aliyuncs.efc_service.model.v20190318;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.efc_service.transform.v20190318.QueryReservedInstanceSharedInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryReservedInstanceSharedInfosResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private Integer count;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private String message;

	private String region;

	private String requestId;

	private List<EcsRiShareInfo> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsRiShareInfo> getData() {
		return this.data;
	}

	public void setData(List<EcsRiShareInfo> data) {
		this.data = data;
	}

	public static class EcsRiShareInfo {

		private Long mainAccountPk;

		private Long subAccountPk;

		private String relationType;

		private String riInstanceId;

		private Long effectTime;

		private String region;

		public Long getMainAccountPk() {
			return this.mainAccountPk;
		}

		public void setMainAccountPk(Long mainAccountPk) {
			this.mainAccountPk = mainAccountPk;
		}

		public Long getSubAccountPk() {
			return this.subAccountPk;
		}

		public void setSubAccountPk(Long subAccountPk) {
			this.subAccountPk = subAccountPk;
		}

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getRiInstanceId() {
			return this.riInstanceId;
		}

		public void setRiInstanceId(String riInstanceId) {
			this.riInstanceId = riInstanceId;
		}

		public Long getEffectTime() {
			return this.effectTime;
		}

		public void setEffectTime(Long effectTime) {
			this.effectTime = effectTime;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public QueryReservedInstanceSharedInfosResponse getInstance(UnmarshallerContext context) {
		return	QueryReservedInstanceSharedInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
