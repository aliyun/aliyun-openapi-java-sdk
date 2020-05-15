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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.DeployVersionAutoCreateResponse;
import com.aliyuncs.lrg.model.v20191010.DeployVersionAutoCreateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployVersionAutoCreateResponseUnmarshaller {

	public static DeployVersionAutoCreateResponse unmarshall(DeployVersionAutoCreateResponse deployVersionAutoCreateResponse, UnmarshallerContext _ctx) {
		
		deployVersionAutoCreateResponse.setStatus(_ctx.stringValue("DeployVersionAutoCreateResponse.status"));
		deployVersionAutoCreateResponse.setDetails(_ctx.stringValue("DeployVersionAutoCreateResponse.details"));
		deployVersionAutoCreateResponse.setReason(_ctx.stringValue("DeployVersionAutoCreateResponse.reason"));
		deployVersionAutoCreateResponse.setErrorCode(_ctx.stringValue("DeployVersionAutoCreateResponse.errorCode"));
		deployVersionAutoCreateResponse.setRequestId(_ctx.stringValue("DeployVersionAutoCreateResponse.requestId"));
		deployVersionAutoCreateResponse.setErrorCode1(_ctx.stringValue("DeployVersionAutoCreateResponse.errorCode"));

		Data data = new Data();
		data.setId(_ctx.integerValue("DeployVersionAutoCreateResponse.data.id"));
		data.setVersionName(_ctx.stringValue("DeployVersionAutoCreateResponse.data.versionName"));
		data.setName(_ctx.stringValue("DeployVersionAutoCreateResponse.data.name"));
		data.setDescription(_ctx.stringValue("DeployVersionAutoCreateResponse.data.description"));
		data.setProductId(_ctx.integerValue("DeployVersionAutoCreateResponse.data.productId"));
		data.setProductName(_ctx.stringValue("DeployVersionAutoCreateResponse.data.productName"));
		data.setGmtCreate(_ctx.stringValue("DeployVersionAutoCreateResponse.data.gmtCreate"));
		data.setCreator(_ctx.stringValue("DeployVersionAutoCreateResponse.data.creator"));
		data.setCreatorName(_ctx.stringValue("DeployVersionAutoCreateResponse.data.creatorName"));
		data.setGmtModified(_ctx.stringValue("DeployVersionAutoCreateResponse.data.gmtModified"));
		data.setRelated(_ctx.booleanValue("DeployVersionAutoCreateResponse.data.related"));
		data.setBaseVersionId(_ctx.integerValue("DeployVersionAutoCreateResponse.data.baseVersionId"));
		data.setBaseVersionName(_ctx.stringValue("DeployVersionAutoCreateResponse.data.baseVersionName"));
		data.setProductReleaseId(_ctx.integerValue("DeployVersionAutoCreateResponse.data.productReleaseId"));
		data.setVersionUrl(_ctx.stringValue("DeployVersionAutoCreateResponse.data.versionUrl"));
		deployVersionAutoCreateResponse.setData(data);
	 
	 	return deployVersionAutoCreateResponse;
	}
}