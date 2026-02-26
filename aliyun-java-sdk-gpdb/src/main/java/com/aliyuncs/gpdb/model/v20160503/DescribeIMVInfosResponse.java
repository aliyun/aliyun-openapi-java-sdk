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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeIMVInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIMVInfosResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private List<ImvInfo> imvInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public List<ImvInfo> getImvInfos() {
		return this.imvInfos;
	}

	public void setImvInfos(List<ImvInfo> imvInfos) {
		this.imvInfos = imvInfos;
	}

	public static class ImvInfo {

		private String mV;

		private String base;

		private String detailInfo;

		public String getMV() {
			return this.mV;
		}

		public void setMV(String mV) {
			this.mV = mV;
		}

		public String getBase() {
			return this.base;
		}

		public void setBase(String base) {
			this.base = base;
		}

		public String getDetailInfo() {
			return this.detailInfo;
		}

		public void setDetailInfo(String detailInfo) {
			this.detailInfo = detailInfo;
		}
	}

	@Override
	public DescribeIMVInfosResponse getInstance(UnmarshallerContext context) {
		return	DescribeIMVInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
