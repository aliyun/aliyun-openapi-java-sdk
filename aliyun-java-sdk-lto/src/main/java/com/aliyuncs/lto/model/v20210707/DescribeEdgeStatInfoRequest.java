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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeStatInfoRequest extends RpcAcsRequest<DescribeEdgeStatInfoResponse> {
	   

	private String edgeDn;

	private String edgePk;
	public DescribeEdgeStatInfoRequest() {
		super("lto", "2021-07-07", "DescribeEdgeStatInfo");
		setMethod(MethodType.POST);
	}

	public String getEdgeDn() {
		return this.edgeDn;
	}

	public void setEdgeDn(String edgeDn) {
		this.edgeDn = edgeDn;
		if(edgeDn != null){
			putQueryParameter("EdgeDn", edgeDn);
		}
	}

	public String getEdgePk() {
		return this.edgePk;
	}

	public void setEdgePk(String edgePk) {
		this.edgePk = edgePk;
		if(edgePk != null){
			putQueryParameter("EdgePk", edgePk);
		}
	}

	@Override
	public Class<DescribeEdgeStatInfoResponse> getResponseClass() {
		return DescribeEdgeStatInfoResponse.class;
	}

}
