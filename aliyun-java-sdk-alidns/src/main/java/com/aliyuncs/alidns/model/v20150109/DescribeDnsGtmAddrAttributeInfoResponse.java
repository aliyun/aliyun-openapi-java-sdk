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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmAddrAttributeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmAddrAttributeInfoResponse extends AcsResponse {

	private String requestId;

	private List<AddrItem> addr;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AddrItem> getAddr() {
		return this.addr;
	}

	public void setAddr(List<AddrItem> addr) {
		this.addr = addr;
	}

	public static class AddrItem {

		private String addr;

		private AttributeInfo attributeInfo;

		public String getAddr() {
			return this.addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public AttributeInfo getAttributeInfo() {
			return this.attributeInfo;
		}

		public void setAttributeInfo(AttributeInfo attributeInfo) {
			this.attributeInfo = attributeInfo;
		}

		public static class AttributeInfo {

			private String lineCode;

			private String lineName;

			private String groupCode;

			private String groupName;

			private String fatherCode;

			public String getLineCode() {
				return this.lineCode;
			}

			public void setLineCode(String lineCode) {
				this.lineCode = lineCode;
			}

			public String getLineName() {
				return this.lineName;
			}

			public void setLineName(String lineName) {
				this.lineName = lineName;
			}

			public String getGroupCode() {
				return this.groupCode;
			}

			public void setGroupCode(String groupCode) {
				this.groupCode = groupCode;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getFatherCode() {
				return this.fatherCode;
			}

			public void setFatherCode(String fatherCode) {
				this.fatherCode = fatherCode;
			}
		}
	}

	@Override
	public DescribeDnsGtmAddrAttributeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmAddrAttributeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
