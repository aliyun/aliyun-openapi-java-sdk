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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsRegionQueryAllResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsRegionQueryAllResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<Item> data;

	private ErrorCode errorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static class Item {

		private String regionNoAlias;

		private String regionMemo;

		private String regionName;

		private String regionNo;

		private String regionEnName;

		private String isActive;

		private Long id;

		private Attributes attributes;

		public String getRegionNoAlias() {
			return this.regionNoAlias;
		}

		public void setRegionNoAlias(String regionNoAlias) {
			this.regionNoAlias = regionNoAlias;
		}

		public String getRegionMemo() {
			return this.regionMemo;
		}

		public void setRegionMemo(String regionMemo) {
			this.regionMemo = regionMemo;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getRegionEnName() {
			return this.regionEnName;
		}

		public void setRegionEnName(String regionEnName) {
			this.regionEnName = regionEnName;
		}

		public String getIsActive() {
			return this.isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Attributes getAttributes() {
			return this.attributes;
		}

		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}

		public static class Attributes {

			private String support_image_copy;

			private String internal_use;

			private String ak_name;

			public String getSupport_image_copy() {
				return this.support_image_copy;
			}

			public void setSupport_image_copy(String support_image_copy) {
				this.support_image_copy = support_image_copy;
			}

			public String getInternal_use() {
				return this.internal_use;
			}

			public void setInternal_use(String internal_use) {
				this.internal_use = internal_use;
			}

			public String getAk_name() {
				return this.ak_name;
			}

			public void setAk_name(String ak_name) {
				this.ak_name = ak_name;
			}
		}
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	@Override
	public InnerEcsRegionQueryAllResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsRegionQueryAllResponseUnmarshaller.unmarshall(this, context);
	}
}
