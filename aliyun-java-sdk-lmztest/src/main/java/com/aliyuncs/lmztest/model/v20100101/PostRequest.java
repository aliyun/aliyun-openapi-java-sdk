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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostRequest extends RoaAcsRequest<PostResponse> {
	   

	private String xb;

	private String xc;
	public PostRequest() {
		super("LmzTest", "2010-01-01", "Post");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/addddd/ab/cd");
		setMethod(MethodType.POST);
	}

	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
		if(xb != null){
			putHeaderParameter("x-b", xb);
		}
	}

	public String getXc() {
		return this.xc;
	}

	public void setXc(String xc) {
		this.xc = xc;
		if(xc != null){
			putHeaderParameter("x-c", xc);
		}
	}

	@Override
	public Class<PostResponse> getResponseClass() {
		return PostResponse.class;
	}

}
