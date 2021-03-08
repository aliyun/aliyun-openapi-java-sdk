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

import com.aliyuncs.dataworks_public.model.v20200518.GetTopicInfluenceResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetTopicInfluenceResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetTopicInfluenceResponse.Data.InfluencesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicInfluenceResponseUnmarshaller {

	public static GetTopicInfluenceResponse unmarshall(GetTopicInfluenceResponse getTopicInfluenceResponse, UnmarshallerContext _ctx) {
		
		getTopicInfluenceResponse.setRequestId(_ctx.stringValue("GetTopicInfluenceResponse.RequestId"));
		getTopicInfluenceResponse.setSuccess(_ctx.booleanValue("GetTopicInfluenceResponse.Success"));
		getTopicInfluenceResponse.setErrorCode(_ctx.stringValue("GetTopicInfluenceResponse.ErrorCode"));
		getTopicInfluenceResponse.setErrorMessage(_ctx.stringValue("GetTopicInfluenceResponse.ErrorMessage"));
		getTopicInfluenceResponse.setHttpStatusCode(_ctx.integerValue("GetTopicInfluenceResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTopicId(_ctx.longValue("GetTopicInfluenceResponse.Data.TopicId"));

		List<InfluencesItem> influences = new ArrayList<InfluencesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTopicInfluenceResponse.Data.Influences.Length"); i++) {
			InfluencesItem influencesItem = new InfluencesItem();
			influencesItem.setBaselineId(_ctx.longValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].BaselineId"));
			influencesItem.setBizdate(_ctx.longValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].Bizdate"));
			influencesItem.setInGroupId(_ctx.integerValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].InGroupId"));
			influencesItem.setBaselineName(_ctx.stringValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].BaselineName"));
			influencesItem.setOwner(_ctx.stringValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].Owner"));
			influencesItem.setStatus(_ctx.stringValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].Status"));
			influencesItem.setProjectId(_ctx.longValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].ProjectId"));
			influencesItem.setPriority(_ctx.integerValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].Priority"));
			influencesItem.setBuffer(_ctx.longValue("GetTopicInfluenceResponse.Data.Influences["+ i +"].Buffer"));

			influences.add(influencesItem);
		}
		data.setInfluences(influences);
		getTopicInfluenceResponse.setData(data);
	 
	 	return getTopicInfluenceResponse;
	}
}