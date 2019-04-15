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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeInstanceStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Entity> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Entity> getData() {
		return this.data;
	}

	public void setData(List<Entity> data) {
		this.data = data;
	}

	public static class Entity {

		private String uuid;

		private Integer account;

		private Integer health;

		private Integer trojan;

		private Integer suspicious;

		private Integer vul;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getAccount() {
			return this.account;
		}

		public void setAccount(Integer account) {
			this.account = account;
		}

		public Integer getHealth() {
			return this.health;
		}

		public void setHealth(Integer health) {
			this.health = health;
		}

		public Integer getTrojan() {
			return this.trojan;
		}

		public void setTrojan(Integer trojan) {
			this.trojan = trojan;
		}

		public Integer getSuspicious() {
			return this.suspicious;
		}

		public void setSuspicious(Integer suspicious) {
			this.suspicious = suspicious;
		}

		public Integer getVul() {
			return this.vul;
		}

		public void setVul(Integer vul) {
			this.vul = vul;
		}
	}

	@Override
	public DescribeInstanceStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
