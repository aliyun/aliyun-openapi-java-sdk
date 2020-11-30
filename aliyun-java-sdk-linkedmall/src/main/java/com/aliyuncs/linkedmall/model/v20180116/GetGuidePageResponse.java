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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.GetGuidePageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGuidePageResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<MiniShopInfoItem> miniShopInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<MiniShopInfoItem> getMiniShopInfo() {
		return this.miniShopInfo;
	}

	public void setMiniShopInfo(List<MiniShopInfoItem> miniShopInfo) {
		this.miniShopInfo = miniShopInfo;
	}

	public static class MiniShopInfoItem {

		private String bizId;

		private String name;

		private String src;

		private String liteShopId;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSrc() {
			return this.src;
		}

		public void setSrc(String src) {
			this.src = src;
		}

		public String getLiteShopId() {
			return this.liteShopId;
		}

		public void setLiteShopId(String liteShopId) {
			this.liteShopId = liteShopId;
		}
	}

	@Override
	public GetGuidePageResponse getInstance(UnmarshallerContext context) {
		return	GetGuidePageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
