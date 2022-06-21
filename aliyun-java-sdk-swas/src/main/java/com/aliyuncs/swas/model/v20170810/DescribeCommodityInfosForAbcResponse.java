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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.DescribeCommodityInfosForAbcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommodityInfosForAbcResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private Integer pageNo;

	private String message;

	private Integer pageSize;

	private Integer totalCount;

	private List<CommodityInfosItem> commodityInfos;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<CommodityInfosItem> getCommodityInfos() {
		return this.commodityInfos;
	}

	public void setCommodityInfos(List<CommodityInfosItem> commodityInfos) {
		this.commodityInfos = commodityInfos;
	}

	public static class CommodityInfosItem {

		private String commodityCode;

		private Long gmtCreate;

		private String commodityType;

		private Long gmtModified;

		private Long id;

		private String commodityVersion;

		private String regionId;

		private Map<Object,Object> commodityContent;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getCommodityType() {
			return this.commodityType;
		}

		public void setCommodityType(String commodityType) {
			this.commodityType = commodityType;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCommodityVersion() {
			return this.commodityVersion;
		}

		public void setCommodityVersion(String commodityVersion) {
			this.commodityVersion = commodityVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Map<Object,Object> getCommodityContent() {
			return this.commodityContent;
		}

		public void setCommodityContent(Map<Object,Object> commodityContent) {
			this.commodityContent = commodityContent;
		}
	}

	@Override
	public DescribeCommodityInfosForAbcResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommodityInfosForAbcResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
