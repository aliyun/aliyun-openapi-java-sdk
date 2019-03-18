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

package com.aliyuncs.cas.model.v20180813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeOrderDocumentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrderDocumentResponse extends AcsResponse {

	private String requestId;

	private List<OrderDocument> orderDocumentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OrderDocument> getOrderDocumentList() {
		return this.orderDocumentList;
	}

	public void setOrderDocumentList(List<OrderDocument> orderDocumentList) {
		this.orderDocumentList = orderDocumentList;
	}

	public static class OrderDocument {

		private Integer documentType;

		private String tplDocNote;

		private String tplDocOssKey;

		private String orderDocOssKey;

		private Long orderDocDate;

		private String orderDocExt;

		public Integer getDocumentType() {
			return this.documentType;
		}

		public void setDocumentType(Integer documentType) {
			this.documentType = documentType;
		}

		public String getTplDocNote() {
			return this.tplDocNote;
		}

		public void setTplDocNote(String tplDocNote) {
			this.tplDocNote = tplDocNote;
		}

		public String getTplDocOssKey() {
			return this.tplDocOssKey;
		}

		public void setTplDocOssKey(String tplDocOssKey) {
			this.tplDocOssKey = tplDocOssKey;
		}

		public String getOrderDocOssKey() {
			return this.orderDocOssKey;
		}

		public void setOrderDocOssKey(String orderDocOssKey) {
			this.orderDocOssKey = orderDocOssKey;
		}

		public Long getOrderDocDate() {
			return this.orderDocDate;
		}

		public void setOrderDocDate(Long orderDocDate) {
			this.orderDocDate = orderDocDate;
		}

		public String getOrderDocExt() {
			return this.orderDocExt;
		}

		public void setOrderDocExt(String orderDocExt) {
			this.orderDocExt = orderDocExt;
		}
	}

	@Override
	public DescribeOrderDocumentResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrderDocumentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
