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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.ListSlotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlotResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long total;

	private List<AdSlot> model;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<AdSlot> getModel() {
		return this.model;
	}

	public void setModel(List<AdSlot> model) {
		this.model = model;
	}

	public static class AdSlot {

		private Long createTime;

		private Long modifyTime;

		private String tenantId;

		private String mediaName;

		private String mediaId;

		private String adSlotId;

		private String adSlotName;

		private String adSlotType;

		private String adSlotTemplateId;

		private String adSlotStatus;

		private String adSlotCorporateStatus;

		private String extInfo;

		private String blockingRule;

		private String inspireScene;

		private Long version;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getMediaName() {
			return this.mediaName;
		}

		public void setMediaName(String mediaName) {
			this.mediaName = mediaName;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getAdSlotId() {
			return this.adSlotId;
		}

		public void setAdSlotId(String adSlotId) {
			this.adSlotId = adSlotId;
		}

		public String getAdSlotName() {
			return this.adSlotName;
		}

		public void setAdSlotName(String adSlotName) {
			this.adSlotName = adSlotName;
		}

		public String getAdSlotType() {
			return this.adSlotType;
		}

		public void setAdSlotType(String adSlotType) {
			this.adSlotType = adSlotType;
		}

		public String getAdSlotTemplateId() {
			return this.adSlotTemplateId;
		}

		public void setAdSlotTemplateId(String adSlotTemplateId) {
			this.adSlotTemplateId = adSlotTemplateId;
		}

		public String getAdSlotStatus() {
			return this.adSlotStatus;
		}

		public void setAdSlotStatus(String adSlotStatus) {
			this.adSlotStatus = adSlotStatus;
		}

		public String getAdSlotCorporateStatus() {
			return this.adSlotCorporateStatus;
		}

		public void setAdSlotCorporateStatus(String adSlotCorporateStatus) {
			this.adSlotCorporateStatus = adSlotCorporateStatus;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getBlockingRule() {
			return this.blockingRule;
		}

		public void setBlockingRule(String blockingRule) {
			this.blockingRule = blockingRule;
		}

		public String getInspireScene() {
			return this.inspireScene;
		}

		public void setInspireScene(String inspireScene) {
			this.inspireScene = inspireScene;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}
	}

	@Override
	public ListSlotResponse getInstance(UnmarshallerContext context) {
		return	ListSlotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
