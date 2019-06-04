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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainRecordDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainRecordDataResponse extends AcsResponse {

	private String requestId;

	private List<RecordDataInfo> recordDataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordDataInfo> getRecordDataInfos() {
		return this.recordDataInfos;
	}

	public void setRecordDataInfos(List<RecordDataInfo> recordDataInfos) {
		this.recordDataInfos = recordDataInfos;
	}

	public static class RecordDataInfo {

		private String date;

		private Integer total;

		private Detail detail;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public static class Detail {

			private Integer mP4;

			private Integer fLV;

			private Integer tS;

			public Integer getMP4() {
				return this.mP4;
			}

			public void setMP4(Integer mP4) {
				this.mP4 = mP4;
			}

			public Integer getFLV() {
				return this.fLV;
			}

			public void setFLV(Integer fLV) {
				this.fLV = fLV;
			}

			public Integer getTS() {
				return this.tS;
			}

			public void setTS(Integer tS) {
				this.tS = tS;
			}
		}
	}

	@Override
	public DescribeLiveDomainRecordDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainRecordDataResponseUnmarshaller.unmarshall(this, context);
	}
}
