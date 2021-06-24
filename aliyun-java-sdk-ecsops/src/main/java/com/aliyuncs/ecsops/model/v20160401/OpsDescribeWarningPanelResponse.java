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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeWarningPanelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeWarningPanelResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String p1done;

		private String p1doing;

		private String p2done;

		private String p2total;

		private String p3waiting;

		private String p1waiting;

		private String total;

		private String p1total;

		private String waiting;

		private String done;

		private String p2waiting;

		private String p3total;

		private String p3doing;

		private String p3done;

		private String p2doing;

		private String doing;

		public String getP1done() {
			return this.p1done;
		}

		public void setP1done(String p1done) {
			this.p1done = p1done;
		}

		public String getP1doing() {
			return this.p1doing;
		}

		public void setP1doing(String p1doing) {
			this.p1doing = p1doing;
		}

		public String getP2done() {
			return this.p2done;
		}

		public void setP2done(String p2done) {
			this.p2done = p2done;
		}

		public String getP2total() {
			return this.p2total;
		}

		public void setP2total(String p2total) {
			this.p2total = p2total;
		}

		public String getP3waiting() {
			return this.p3waiting;
		}

		public void setP3waiting(String p3waiting) {
			this.p3waiting = p3waiting;
		}

		public String getP1waiting() {
			return this.p1waiting;
		}

		public void setP1waiting(String p1waiting) {
			this.p1waiting = p1waiting;
		}

		public String getTotal() {
			return this.total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getP1total() {
			return this.p1total;
		}

		public void setP1total(String p1total) {
			this.p1total = p1total;
		}

		public String getWaiting() {
			return this.waiting;
		}

		public void setWaiting(String waiting) {
			this.waiting = waiting;
		}

		public String getDone() {
			return this.done;
		}

		public void setDone(String done) {
			this.done = done;
		}

		public String getP2waiting() {
			return this.p2waiting;
		}

		public void setP2waiting(String p2waiting) {
			this.p2waiting = p2waiting;
		}

		public String getP3total() {
			return this.p3total;
		}

		public void setP3total(String p3total) {
			this.p3total = p3total;
		}

		public String getP3doing() {
			return this.p3doing;
		}

		public void setP3doing(String p3doing) {
			this.p3doing = p3doing;
		}

		public String getP3done() {
			return this.p3done;
		}

		public void setP3done(String p3done) {
			this.p3done = p3done;
		}

		public String getP2doing() {
			return this.p2doing;
		}

		public void setP2doing(String p2doing) {
			this.p2doing = p2doing;
		}

		public String getDoing() {
			return this.doing;
		}

		public void setDoing(String doing) {
			this.doing = doing;
		}
	}

	@Override
	public OpsDescribeWarningPanelResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeWarningPanelResponseUnmarshaller.unmarshall(this, context);
	}
}
