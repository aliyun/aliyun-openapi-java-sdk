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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse;
import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse.Data.Dataset;
import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse.Data.Dataset.Policy1;
import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse.Data.Source;
import com.aliyuncs.xrengine.model.v20221111.CreateProjectResponse.Data.Source.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext _ctx) {
		
		createProjectResponse.setRequestId(_ctx.stringValue("CreateProjectResponse.RequestId"));
		createProjectResponse.setSuccess(_ctx.booleanValue("CreateProjectResponse.Success"));
		createProjectResponse.setCode(_ctx.stringValue("CreateProjectResponse.Code"));
		createProjectResponse.setMessage(_ctx.stringValue("CreateProjectResponse.Message"));

		Data data = new Data();
		data.setTitle(_ctx.stringValue("CreateProjectResponse.Data.Title"));
		data.setType(_ctx.stringValue("CreateProjectResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("CreateProjectResponse.Data.Status"));
		data.setBizMethod(_ctx.stringValue("CreateProjectResponse.Data.Method"));
		data.setCreateMode(_ctx.stringValue("CreateProjectResponse.Data.CreateMode"));
		data.setIntro(_ctx.stringValue("CreateProjectResponse.Data.Intro"));
		data.setId(_ctx.stringValue("CreateProjectResponse.Data.Id"));
		data.setCreateTime(_ctx.stringValue("CreateProjectResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreateProjectResponse.Data.ModifiedTime"));

		Source source = new Source();
		source.setOssKey(_ctx.stringValue("CreateProjectResponse.Data.Source.OssKey"));

		Policy policy = new Policy();
		policy.setAccessId(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.AccessId"));
		policy.setPolicy(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.Policy"));
		policy.setSignature(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.Signature"));
		policy.setDir(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.Dir"));
		policy.setHost(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.Host"));
		policy.setExpire(_ctx.stringValue("CreateProjectResponse.Data.Source.Policy.Expire"));
		source.setPolicy(policy);
		data.setSource(source);

		Dataset dataset = new Dataset();
		dataset.setOssKey(_ctx.stringValue("CreateProjectResponse.Data.Dataset.OssKey"));
		dataset.setId(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Id"));
		dataset.setCreateTime(_ctx.stringValue("CreateProjectResponse.Data.Dataset.CreateTime"));
		dataset.setModifiedTime(_ctx.stringValue("CreateProjectResponse.Data.Dataset.ModifiedTime"));

		Policy1 policy1 = new Policy1();
		policy1.setAccessId(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.AccessId"));
		policy1.setPolicy(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.Policy"));
		policy1.setSignature(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.Signature"));
		policy1.setDir(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.Dir"));
		policy1.setHost(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.Host"));
		policy1.setExpire(_ctx.stringValue("CreateProjectResponse.Data.Dataset.Policy.Expire"));
		dataset.setPolicy1(policy1);
		data.setDataset(dataset);
		createProjectResponse.setData(data);
	 
	 	return createProjectResponse;
	}
}