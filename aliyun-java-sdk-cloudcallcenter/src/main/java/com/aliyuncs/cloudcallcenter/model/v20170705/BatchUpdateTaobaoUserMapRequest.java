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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class BatchUpdateTaobaoUserMapRequest extends RpcAcsRequest<BatchUpdateTaobaoUserMapResponse> {
	
	public BatchUpdateTaobaoUserMapRequest() {
		super("CloudCallCenter", "2017-07-05", "BatchUpdateTaobaoUserMap", "CloudCallCenter", "innerAPI");
	}

	private List<TaobaoAliyunAccount> taobaoAliyunAccounts;

	public List<TaobaoAliyunAccount> getTaobaoAliyunAccounts() {
		return this.taobaoAliyunAccounts;
	}

	public void setTaobaoAliyunAccounts(List<TaobaoAliyunAccount> taobaoAliyunAccounts) {
		this.taobaoAliyunAccounts = taobaoAliyunAccounts;	
		if (taobaoAliyunAccounts != null) {
			for (int depth1 = 0; depth1 < taobaoAliyunAccounts.size(); depth1++) {
				putQueryParameter("TaobaoAliyunAccount." + (depth1 + 1) + ".aliyunPk" , taobaoAliyunAccounts.get(depth1).getAliyunPk());
				putQueryParameter("TaobaoAliyunAccount." + (depth1 + 1) + ".TaobaoNick" , taobaoAliyunAccounts.get(depth1).getTaobaoNick());
				putQueryParameter("TaobaoAliyunAccount." + (depth1 + 1) + ".TaobaoUid" , taobaoAliyunAccounts.get(depth1).getTaobaoUid());
				putQueryParameter("TaobaoAliyunAccount." + (depth1 + 1) + ".Type" , taobaoAliyunAccounts.get(depth1).getType());
				putQueryParameter("TaobaoAliyunAccount." + (depth1 + 1) + ".Status" , taobaoAliyunAccounts.get(depth1).getStatus());
			}
		}	
	}

	public static class TaobaoAliyunAccount {

		private Long aliyunPk;

		private String taobaoNick;

		private Long taobaoUid;

		private Integer type;

		private Integer status;

		public Long getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(Long aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getTaobaoNick() {
			return this.taobaoNick;
		}

		public void setTaobaoNick(String taobaoNick) {
			this.taobaoNick = taobaoNick;
		}

		public Long getTaobaoUid() {
			return this.taobaoUid;
		}

		public void setTaobaoUid(Long taobaoUid) {
			this.taobaoUid = taobaoUid;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<BatchUpdateTaobaoUserMapResponse> getResponseClass() {
		return BatchUpdateTaobaoUserMapResponse.class;
	}

}
