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
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsExpireRegionQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsExpireRegionQueryResponse extends AcsResponse {

	private String requestId;

	private List<ExpireRegion> expireRegions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ExpireRegion> getExpireRegions() {
		return this.expireRegions;
	}

	public void setExpireRegions(List<ExpireRegion> expireRegions) {
		this.expireRegions = expireRegions;
	}

	public static class ExpireRegion {

		private String regionId;

		private String regionName;

		private String message;

		private String messageId;

		private String extMessage;

		private String extMessageId;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getExtMessage() {
			return this.extMessage;
		}

		public void setExtMessage(String extMessage) {
			this.extMessage = extMessage;
		}

		public String getExtMessageId() {
			return this.extMessageId;
		}

		public void setExtMessageId(String extMessageId) {
			this.extMessageId = extMessageId;
		}
	}

	@Override
	public InnerEcsExpireRegionQueryResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsExpireRegionQueryResponseUnmarshaller.unmarshall(this, context);
	}
}
