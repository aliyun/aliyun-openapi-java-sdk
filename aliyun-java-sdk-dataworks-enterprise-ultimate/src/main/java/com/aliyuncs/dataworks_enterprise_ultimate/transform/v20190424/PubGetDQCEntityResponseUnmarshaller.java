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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCEntityResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCEntityResponse.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubGetDQCEntityResponseUnmarshaller {

	public static PubGetDQCEntityResponse unmarshall(PubGetDQCEntityResponse pubGetDQCEntityResponse, UnmarshallerContext _ctx) {
		
		pubGetDQCEntityResponse.setReturnCode(_ctx.stringValue("PubGetDQCEntityResponse.ReturnCode"));

		List<Entity> returnValue = new ArrayList<Entity>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCEntityResponse.ReturnValue.Length"); i++) {
			Entity entity = new Entity();
			entity.setId(_ctx.longValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].Id"));
			entity.setProjectName(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].ProjectName"));
			entity.setTableName(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].TableName"));
			entity.setEnvType(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].EnvType"));
			entity.setMatchExpression(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].MatchExpression"));
			entity.setEntityLevel(_ctx.integerValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].EntityLevel"));
			entity.setOnDuty(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].OnDuty"));
			entity.setModifyUser(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].ModifyUser"));
			entity.setGmtCreate(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].GmtCreate"));
			entity.setGmtModify(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].GmtModify"));
			entity.setSql(_ctx.integerValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].Sql"));
			entity.setTask(_ctx.integerValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].Task"));
			entity.setFollowers(_ctx.stringValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].Followers"));
			entity.setHasRelativeNode(_ctx.booleanValue("PubGetDQCEntityResponse.ReturnValue["+ i +"].HasRelativeNode"));

			returnValue.add(entity);
		}
		pubGetDQCEntityResponse.setReturnValue(returnValue);
	 
	 	return pubGetDQCEntityResponse;
	}
}