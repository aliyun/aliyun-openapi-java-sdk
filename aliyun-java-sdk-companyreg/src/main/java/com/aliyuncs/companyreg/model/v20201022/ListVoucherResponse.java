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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.ListVoucherResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVoucherResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private Integer pageCount;

	private List<ResultItem> result;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String writtenPerson;

		private String voucherType;

		private Long voucherDate;

		private Integer uploadAttachmentCount;

		private Long createdStamp;

		private String voucherNo;

		private String refVoucherIds;

		private Boolean hasEditAuthority;

		private String refVoucherInfo;

		private Long id;

		private String period;

		private List<DetailsItem> details;

		private ExtAttributes extAttributes;

		private VoucherTransCategoryId voucherTransCategoryId;

		public String getWrittenPerson() {
			return this.writtenPerson;
		}

		public void setWrittenPerson(String writtenPerson) {
			this.writtenPerson = writtenPerson;
		}

		public String getVoucherType() {
			return this.voucherType;
		}

		public void setVoucherType(String voucherType) {
			this.voucherType = voucherType;
		}

		public Long getVoucherDate() {
			return this.voucherDate;
		}

		public void setVoucherDate(Long voucherDate) {
			this.voucherDate = voucherDate;
		}

		public Integer getUploadAttachmentCount() {
			return this.uploadAttachmentCount;
		}

		public void setUploadAttachmentCount(Integer uploadAttachmentCount) {
			this.uploadAttachmentCount = uploadAttachmentCount;
		}

		public Long getCreatedStamp() {
			return this.createdStamp;
		}

		public void setCreatedStamp(Long createdStamp) {
			this.createdStamp = createdStamp;
		}

		public String getVoucherNo() {
			return this.voucherNo;
		}

		public void setVoucherNo(String voucherNo) {
			this.voucherNo = voucherNo;
		}

		public String getRefVoucherIds() {
			return this.refVoucherIds;
		}

		public void setRefVoucherIds(String refVoucherIds) {
			this.refVoucherIds = refVoucherIds;
		}

		public Boolean getHasEditAuthority() {
			return this.hasEditAuthority;
		}

		public void setHasEditAuthority(Boolean hasEditAuthority) {
			this.hasEditAuthority = hasEditAuthority;
		}

		public String getRefVoucherInfo() {
			return this.refVoucherInfo;
		}

		public void setRefVoucherInfo(String refVoucherInfo) {
			this.refVoucherInfo = refVoucherInfo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public List<DetailsItem> getDetails() {
			return this.details;
		}

		public void setDetails(List<DetailsItem> details) {
			this.details = details;
		}

		public ExtAttributes getExtAttributes() {
			return this.extAttributes;
		}

		public void setExtAttributes(ExtAttributes extAttributes) {
			this.extAttributes = extAttributes;
		}

		public VoucherTransCategoryId getVoucherTransCategoryId() {
			return this.voucherTransCategoryId;
		}

		public void setVoucherTransCategoryId(VoucherTransCategoryId voucherTransCategoryId) {
			this.voucherTransCategoryId = voucherTransCategoryId;
		}

		public static class DetailsItem {

			private String comments;

			private Float basePostedDebtor;

			private Float basePostedCreditor;

			public String getComments() {
				return this.comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}

			public Float getBasePostedDebtor() {
				return this.basePostedDebtor;
			}

			public void setBasePostedDebtor(Float basePostedDebtor) {
				this.basePostedDebtor = basePostedDebtor;
			}

			public Float getBasePostedCreditor() {
				return this.basePostedCreditor;
			}

			public void setBasePostedCreditor(Float basePostedCreditor) {
				this.basePostedCreditor = basePostedCreditor;
			}
		}

		public static class ExtAttributes {

			private Integer needCheckCreatorId;

			private Integer updateAttachment;

			private Integer isSupervisor;

			public Integer getNeedCheckCreatorId() {
				return this.needCheckCreatorId;
			}

			public void setNeedCheckCreatorId(Integer needCheckCreatorId) {
				this.needCheckCreatorId = needCheckCreatorId;
			}

			public Integer getUpdateAttachment() {
				return this.updateAttachment;
			}

			public void setUpdateAttachment(Integer updateAttachment) {
				this.updateAttachment = updateAttachment;
			}

			public Integer getIsSupervisor() {
				return this.isSupervisor;
			}

			public void setIsSupervisor(Integer isSupervisor) {
				this.isSupervisor = isSupervisor;
			}
		}

		public static class VoucherTransCategoryId {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListVoucherResponse getInstance(UnmarshallerContext context) {
		return	ListVoucherResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
