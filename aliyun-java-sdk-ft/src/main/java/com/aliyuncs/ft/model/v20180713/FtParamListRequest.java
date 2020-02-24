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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FtParamListRequest extends RpcAcsRequest<FtParamListResponse> {
	   

	private List<Disk> disks;

	private String name;
	public FtParamListRequest() {
		super("Ft", "2018-07-13", "FtParamList");
		setMethod(MethodType.POST);
	}

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;	
		if (disks != null) {
			for (int depth1 = 0; depth1 < disks.size(); depth1++) {
				if (disks.get(depth1).getSizes() != null) {
					for (int i = 0; i < disks.get(depth1).getSizes().size(); i++) {
						putQueryParameter("Disk." + (depth1 + 1) + ".Size." + (i + 1) , disks.get(depth1).getSizes().get(i));
					}
				}
				if (disks.get(depth1).getTypes() != null) {
					for (int i = 0; i < disks.get(depth1).getTypes().size(); i++) {
						putQueryParameter("Disk." + (depth1 + 1) + ".Type." + (i + 1) , disks.get(depth1).getTypes().get(i));
					}
				}
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class Disk {

		private List<String> sizes;

		private List<String> types;

		public List<String> getSizes() {
			return this.sizes;
		}

		public void setSizes(List<String> sizes) {
			this.sizes = sizes;
		}

		public List<String> getTypes() {
			return this.types;
		}

		public void setTypes(List<String> types) {
			this.types = types;
		}
	}

	@Override
	public Class<FtParamListResponse> getResponseClass() {
		return FtParamListResponse.class;
	}

}
