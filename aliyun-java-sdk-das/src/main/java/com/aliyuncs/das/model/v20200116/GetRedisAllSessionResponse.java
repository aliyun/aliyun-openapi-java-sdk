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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetRedisAllSessionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRedisAllSessionResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long timestamp;

		private Long total;

		private List<SessionsItem> sessions;

		private List<SourceStatsItem> sourceStats;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<SessionsItem> getSessions() {
			return this.sessions;
		}

		public void setSessions(List<SessionsItem> sessions) {
			this.sessions = sessions;
		}

		public List<SourceStatsItem> getSourceStats() {
			return this.sourceStats;
		}

		public void setSourceStats(List<SourceStatsItem> sourceStats) {
			this.sourceStats = sourceStats;
		}

		public static class SessionsItem {

			private Long sub;

			private Long psub;

			private Long idle;

			private String flags;

			private Long oll;

			private Long qbufFree;

			private Long multi;

			private Long omem;

			private Long qbuf;

			private String name;

			private Long obl;

			private String client;

			private String cmd;

			private Long id;

			private String addr;

			private String nodeId;

			private String age;

			private Long db;

			private String events;

			private Long fd;

			private String clientDesc;

			public Long getSub() {
				return this.sub;
			}

			public void setSub(Long sub) {
				this.sub = sub;
			}

			public Long getPsub() {
				return this.psub;
			}

			public void setPsub(Long psub) {
				this.psub = psub;
			}

			public Long getIdle() {
				return this.idle;
			}

			public void setIdle(Long idle) {
				this.idle = idle;
			}

			public String getFlags() {
				return this.flags;
			}

			public void setFlags(String flags) {
				this.flags = flags;
			}

			public Long getOll() {
				return this.oll;
			}

			public void setOll(Long oll) {
				this.oll = oll;
			}

			public Long getQbufFree() {
				return this.qbufFree;
			}

			public void setQbufFree(Long qbufFree) {
				this.qbufFree = qbufFree;
			}

			public Long getMulti() {
				return this.multi;
			}

			public void setMulti(Long multi) {
				this.multi = multi;
			}

			public Long getOmem() {
				return this.omem;
			}

			public void setOmem(Long omem) {
				this.omem = omem;
			}

			public Long getQbuf() {
				return this.qbuf;
			}

			public void setQbuf(Long qbuf) {
				this.qbuf = qbuf;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getObl() {
				return this.obl;
			}

			public void setObl(Long obl) {
				this.obl = obl;
			}

			public String getClient() {
				return this.client;
			}

			public void setClient(String client) {
				this.client = client;
			}

			public String getCmd() {
				return this.cmd;
			}

			public void setCmd(String cmd) {
				this.cmd = cmd;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAddr() {
				return this.addr;
			}

			public void setAddr(String addr) {
				this.addr = addr;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getAge() {
				return this.age;
			}

			public void setAge(String age) {
				this.age = age;
			}

			public Long getDb() {
				return this.db;
			}

			public void setDb(Long db) {
				this.db = db;
			}

			public String getEvents() {
				return this.events;
			}

			public void setEvents(String events) {
				this.events = events;
			}

			public Long getFd() {
				return this.fd;
			}

			public void setFd(Long fd) {
				this.fd = fd;
			}

			public String getClientDesc() {
				return this.clientDesc;
			}

			public void setClientDesc(String clientDesc) {
				this.clientDesc = clientDesc;
			}
		}

		public static class SourceStatsItem {

			private String key;

			private String count;

			private List<Long> ids;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}

			public List<Long> getIds() {
				return this.ids;
			}

			public void setIds(List<Long> ids) {
				this.ids = ids;
			}
		}
	}

	@Override
	public GetRedisAllSessionResponse getInstance(UnmarshallerContext context) {
		return	GetRedisAllSessionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
