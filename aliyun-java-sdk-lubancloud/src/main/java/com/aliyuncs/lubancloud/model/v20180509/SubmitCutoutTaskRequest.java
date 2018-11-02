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

package com.aliyuncs.lubancloud.model.v20180509;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitCutoutTaskRequest extends RpcAcsRequest<SubmitCutoutTaskResponse> {
	
	public SubmitCutoutTaskRequest() {
		super("lubancloud", "2018-05-09", "SubmitCutoutTask", "luban");
		setMethod(MethodType.POST);
	}

	private List<String> pictureUrls;

	public List<String> getPictureUrls() {
		return this.pictureUrls;
	}

	public void setPictureUrls(List<String> pictureUrls) {
		this.pictureUrls = pictureUrls;	
		if (pictureUrls != null) {
			for (int i = 0; i < pictureUrls.size(); i++) {
				putQueryParameter("PictureUrl." + (i + 1) , pictureUrls.get(i));
			}
		}	
	}

	@Override
	public Class<SubmitCutoutTaskResponse> getResponseClass() {
		return SubmitCutoutTaskResponse.class;
	}

}
