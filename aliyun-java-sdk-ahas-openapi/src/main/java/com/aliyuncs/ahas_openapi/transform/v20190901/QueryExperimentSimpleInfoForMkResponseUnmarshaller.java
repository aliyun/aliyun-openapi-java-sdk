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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse.AttackItem;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse.BasicInfo;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse.CheckItem;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse.PrepareItem;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentSimpleInfoForMkResponse.RecoverItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryExperimentSimpleInfoForMkResponseUnmarshaller {

	public static QueryExperimentSimpleInfoForMkResponse unmarshall(QueryExperimentSimpleInfoForMkResponse queryExperimentSimpleInfoForMkResponse, UnmarshallerContext _ctx) {
		
		queryExperimentSimpleInfoForMkResponse.setRequestId(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.RequestId"));
		queryExperimentSimpleInfoForMkResponse.setMessage(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Message"));
		queryExperimentSimpleInfoForMkResponse.setHttpStatusCode(_ctx.integerValue("QueryExperimentSimpleInfoForMkResponse.HttpStatusCode"));
		queryExperimentSimpleInfoForMkResponse.setSuccess(_ctx.booleanValue("QueryExperimentSimpleInfoForMkResponse.Success"));
		queryExperimentSimpleInfoForMkResponse.setCode(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Code"));

		BasicInfo basicInfo = new BasicInfo();
		basicInfo.setExperimentId(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.ExperimentId"));
		basicInfo.setName(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.Name"));
		basicInfo.setDescription(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.Description"));
		basicInfo.setNamespace(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.Namespace"));
		basicInfo.setRegionId(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.RegionId"));
		basicInfo.setState(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.State"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.BasicInfo.Tags["+ i +"]"));
		}
		basicInfo.setTags(tags);
		queryExperimentSimpleInfoForMkResponse.setBasicInfo(basicInfo);

		List<AttackItem> attack = new ArrayList<AttackItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentSimpleInfoForMkResponse.Attack.Length"); i++) {
			AttackItem attackItem = new AttackItem();
			attackItem.setName(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Attack["+ i +"].Name"));
			attackItem.setAppCode(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Attack["+ i +"].AppCode"));

			attack.add(attackItem);
		}
		queryExperimentSimpleInfoForMkResponse.setAttack(attack);

		List<PrepareItem> prepare = new ArrayList<PrepareItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentSimpleInfoForMkResponse.Prepare.Length"); i++) {
			PrepareItem prepareItem = new PrepareItem();
			prepareItem.setName(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Prepare["+ i +"].Name"));
			prepareItem.setAppCode(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Prepare["+ i +"].AppCode"));

			prepare.add(prepareItem);
		}
		queryExperimentSimpleInfoForMkResponse.setPrepare(prepare);

		List<CheckItem> check = new ArrayList<CheckItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentSimpleInfoForMkResponse.Check.Length"); i++) {
			CheckItem checkItem = new CheckItem();
			checkItem.setName(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Check["+ i +"].Name"));
			checkItem.setAppCode(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Check["+ i +"].AppCode"));

			check.add(checkItem);
		}
		queryExperimentSimpleInfoForMkResponse.setCheck(check);

		List<RecoverItem> recover = new ArrayList<RecoverItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentSimpleInfoForMkResponse.Recover.Length"); i++) {
			RecoverItem recoverItem = new RecoverItem();
			recoverItem.setName(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Recover["+ i +"].Name"));
			recoverItem.setAppCode(_ctx.stringValue("QueryExperimentSimpleInfoForMkResponse.Recover["+ i +"].AppCode"));

			recover.add(recoverItem);
		}
		queryExperimentSimpleInfoForMkResponse.setRecover(recover);
	 
	 	return queryExperimentSimpleInfoForMkResponse;
	}
}