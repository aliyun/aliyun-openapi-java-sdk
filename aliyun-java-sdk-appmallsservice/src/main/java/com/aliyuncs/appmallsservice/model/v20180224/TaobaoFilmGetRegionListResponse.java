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

package com.aliyuncs.appmallsservice.model.v20180224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appmallsservice.transform.v20180224.TaobaoFilmGetRegionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmGetRegionListResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private String logsId;

	private String requestId;

	private List<RegionsItem> regions;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return this.subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegionsItem> getRegions() {
		return this.regions;
	}

	public void setRegions(List<RegionsItem> regions) {
		this.regions = regions;
	}

	public static class RegionsItem {

		private Long cityCode;

		private Long id;

		private Long parentId;

		private String pinYin;

		private String regionName;

		public Long getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(Long cityCode) {
			this.cityCode = cityCode;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public String getPinYin() {
			return this.pinYin;
		}

		public void setPinYin(String pinYin) {
			this.pinYin = pinYin;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}
	}

	@Override
	public TaobaoFilmGetRegionListResponse getInstance(UnmarshallerContext context) {
		return	TaobaoFilmGetRegionListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
