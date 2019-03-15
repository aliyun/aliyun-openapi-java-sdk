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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ContextQueryLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ContextQueryLogResponse extends AcsResponse {

	private String requestId;

	private String packId;

	private String packMeta;

	private String time;

	private List<Item> logs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPackId() {
		return this.packId;
	}

	public void setPackId(String packId) {
		this.packId = packId;
	}

	public String getPackMeta() {
		return this.packMeta;
	}

	public void setPackMeta(String packMeta) {
		this.packMeta = packMeta;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Item> getLogs() {
		return this.logs;
	}

	public void setLogs(List<Item> logs) {
		this.logs = logs;
	}

	public static class Item {

		private Integer index;

		private String content;

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public ContextQueryLogResponse getInstance(UnmarshallerContext context) {
		return	ContextQueryLogResponseUnmarshaller.unmarshall(this, context);
	}
}
