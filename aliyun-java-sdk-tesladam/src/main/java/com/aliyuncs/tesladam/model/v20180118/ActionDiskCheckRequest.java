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

package com.aliyuncs.tesladam.model.v20180118;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ActionDiskCheckRequest extends RpcAcsRequest<ActionDiskCheckResponse> {
	
	public ActionDiskCheckRequest() {
		super("TeslaDam", "2018-01-18", "ActionDiskCheck", "tesladam");
	}

	private String diskMount;

	private String ip;

	public String getDiskMount() {
		return this.diskMount;
	}

	public void setDiskMount(String diskMount) {
		this.diskMount = diskMount;
		if(diskMount != null){
			putQueryParameter("DiskMount", diskMount);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	@Override
	public Class<ActionDiskCheckResponse> getResponseClass() {
		return ActionDiskCheckResponse.class;
	}

}
