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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceErrorRankResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceErrorRankResponse.InstanceErrorRank;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRankItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceErrorRankResponseUnmarshaller {

	public static GetInstanceErrorRankResponse unmarshall(GetInstanceErrorRankResponse getInstanceErrorRankResponse, UnmarshallerContext _ctx) {
		
		getInstanceErrorRankResponse.setRequestId(_ctx.stringValue("GetInstanceErrorRankResponse.RequestId"));

		InstanceErrorRank instanceErrorRank = new InstanceErrorRank();
		instanceErrorRank.setUpdateTime(_ctx.longValue("GetInstanceErrorRankResponse.InstanceErrorRank.UpdateTime"));

		List<ErrorRankItem> errorRank = new ArrayList<ErrorRankItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank.Length"); i++) {
			ErrorRankItem errorRankItem = new ErrorRankItem();
			errorRankItem.setOwner(_ctx.stringValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].Owner"));
			errorRankItem.setNodeName(_ctx.stringValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].NodeName"));
			errorRankItem.setProjectId(_ctx.longValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].ProjectId"));
			errorRankItem.setNodeId(_ctx.longValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].NodeId"));
			errorRankItem.setCount(_ctx.integerValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].Count"));
			errorRankItem.setPrgType(_ctx.integerValue("GetInstanceErrorRankResponse.InstanceErrorRank.ErrorRank["+ i +"].PrgType"));

			errorRank.add(errorRankItem);
		}
		instanceErrorRank.setErrorRank(errorRank);
		getInstanceErrorRankResponse.setInstanceErrorRank(instanceErrorRank);
	 
	 	return getInstanceErrorRankResponse;
	}
}