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

import com.aliyuncs.dataworks_public.model.v20200518.GetQualityEntityResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetQualityEntityResponse.EntityDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityEntityResponseUnmarshaller {

	public static GetQualityEntityResponse unmarshall(GetQualityEntityResponse getQualityEntityResponse, UnmarshallerContext _ctx) {
		
		getQualityEntityResponse.setRequestId(_ctx.stringValue("GetQualityEntityResponse.RequestId"));
		getQualityEntityResponse.setHttpStatusCode(_ctx.integerValue("GetQualityEntityResponse.HttpStatusCode"));
		getQualityEntityResponse.setErrorMessage(_ctx.stringValue("GetQualityEntityResponse.ErrorMessage"));
		getQualityEntityResponse.setErrorCode(_ctx.stringValue("GetQualityEntityResponse.ErrorCode"));
		getQualityEntityResponse.setSuccess(_ctx.booleanValue("GetQualityEntityResponse.Success"));

		List<EntityDto> data = new ArrayList<EntityDto>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityEntityResponse.Data.Length"); i++) {
			EntityDto entityDto = new EntityDto();
			entityDto.setRelativeNode(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].RelativeNode"));
			entityDto.setOnDutyAccountName(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].OnDutyAccountName"));
			entityDto.setTask(_ctx.integerValue("GetQualityEntityResponse.Data["+ i +"].Task"));
			entityDto.setTableName(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].TableName"));
			entityDto.setFollowers(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].Followers"));
			entityDto.setOnDuty(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].OnDuty"));
			entityDto.setMatchExpression(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].MatchExpression"));
			entityDto.setCreateTime(_ctx.longValue("GetQualityEntityResponse.Data["+ i +"].CreateTime"));
			entityDto.setProjectName(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].ProjectName"));
			entityDto.setHasRelativeNode(_ctx.booleanValue("GetQualityEntityResponse.Data["+ i +"].HasRelativeNode"));
			entityDto.setEnvType(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].EnvType"));
			entityDto.setEntityLevel(_ctx.integerValue("GetQualityEntityResponse.Data["+ i +"].EntityLevel"));
			entityDto.setModifyUser(_ctx.stringValue("GetQualityEntityResponse.Data["+ i +"].ModifyUser"));
			entityDto.setSql(_ctx.integerValue("GetQualityEntityResponse.Data["+ i +"].Sql"));
			entityDto.setId(_ctx.longValue("GetQualityEntityResponse.Data["+ i +"].Id"));
			entityDto.setModifyTime(_ctx.longValue("GetQualityEntityResponse.Data["+ i +"].ModifyTime"));

			data.add(entityDto);
		}
		getQualityEntityResponse.setData(data);
	 
	 	return getQualityEntityResponse;
	}
}