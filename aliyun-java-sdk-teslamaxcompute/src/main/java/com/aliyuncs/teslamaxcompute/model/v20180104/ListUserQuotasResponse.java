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

package com.aliyuncs.teslamaxcompute.model.v20180104;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20180104.ListUserQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserQuotasResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Quotas> detail;

		private Error error;

		public List<Quotas> getDetail() {
			return this.detail;
		}

		public void setDetail(List<Quotas> detail) {
			this.detail = detail;
		}

		public Error getError() {
			return this.error;
		}

		public void setError(Error error) {
			this.error = error;
		}

		public static class Quotas {

			private Long quotaid;

			private String cluster;

			private String region;

			private String name;

			private Long parentid;

			private String nick;

			public Long getQuotaid() {
				return this.quotaid;
			}

			public void setQuotaid(Long quotaid) {
				this.quotaid = quotaid;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getParentid() {
				return this.parentid;
			}

			public void setParentid(Long parentid) {
				this.parentid = parentid;
			}

			public String getNick() {
				return this.nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
			}
		}

		public static class Error {

			private String code;

			private String message;

			private String timestamp;

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

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public ListUserQuotasResponse getInstance(UnmarshallerContext context) {
		return	ListUserQuotasResponseUnmarshaller.unmarshall(this, context);
	}
}
