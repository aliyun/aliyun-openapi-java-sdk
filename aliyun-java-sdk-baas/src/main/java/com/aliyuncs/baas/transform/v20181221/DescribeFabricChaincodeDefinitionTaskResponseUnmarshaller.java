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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeDefinitionTaskResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeDefinitionTaskResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeDefinitionTaskResponse.Result.Content;
import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricChaincodeDefinitionTaskResponseUnmarshaller {

	public static DescribeFabricChaincodeDefinitionTaskResponse unmarshall(DescribeFabricChaincodeDefinitionTaskResponse describeFabricChaincodeDefinitionTaskResponse, UnmarshallerContext _ctx) {
		
		describeFabricChaincodeDefinitionTaskResponse.setRequestId(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.RequestId"));
		describeFabricChaincodeDefinitionTaskResponse.setSuccess(_ctx.booleanValue("DescribeFabricChaincodeDefinitionTaskResponse.Success"));
		describeFabricChaincodeDefinitionTaskResponse.setErrorCode(_ctx.integerValue("DescribeFabricChaincodeDefinitionTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Status"));
		result.setType(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Type"));
		result.setChannelName(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.ChannelName"));
		result.setDescription(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Description"));
		result.setCreateTime(_ctx.longValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.CreateTime"));
		result.setTaskId(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.TaskId"));
		result.setCreator(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Creator"));

		List<String> approvers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Approvers.Length"); i++) {
			approvers.add(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Approvers["+ i +"]"));
		}
		result.setApprovers(approvers);

		Content content = new Content();

		ChaincodeDefinition chaincodeDefinition = new ChaincodeDefinition();
		chaincodeDefinition.setEndorsementPolicy(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.EndorsementPolicy"));
		chaincodeDefinition.setSequence(_ctx.longValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.Sequence"));
		chaincodeDefinition.setVersion(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.Version"));
		chaincodeDefinition.setChaincodePackageId(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.ChaincodePackageId"));
		chaincodeDefinition.setName(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.Name"));
		chaincodeDefinition.setInitRequired(_ctx.booleanValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.InitRequired"));
		chaincodeDefinition.setCollectionConfig(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.CollectionConfig"));
		chaincodeDefinition.setUid(_ctx.stringValue("DescribeFabricChaincodeDefinitionTaskResponse.Result.Content.ChaincodeDefinition.Uid"));
		content.setChaincodeDefinition(chaincodeDefinition);
		result.setContent(content);
		describeFabricChaincodeDefinitionTaskResponse.setResult(result);
	 
	 	return describeFabricChaincodeDefinitionTaskResponse;
	}
}