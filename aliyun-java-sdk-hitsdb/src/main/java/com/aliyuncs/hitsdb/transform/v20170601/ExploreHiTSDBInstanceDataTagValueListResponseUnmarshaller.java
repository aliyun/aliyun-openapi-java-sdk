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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataTagValueListResponse;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataTagValueListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreHiTSDBInstanceDataTagValueListResponseUnmarshaller {

	public static ExploreHiTSDBInstanceDataTagValueListResponse unmarshall(ExploreHiTSDBInstanceDataTagValueListResponse exploreHiTSDBInstanceDataTagValueListResponse, UnmarshallerContext _ctx) {
		
		exploreHiTSDBInstanceDataTagValueListResponse.setRequestId(_ctx.stringValue("ExploreHiTSDBInstanceDataTagValueListResponse.RequestId"));
		exploreHiTSDBInstanceDataTagValueListResponse.setInstanceId(_ctx.stringValue("ExploreHiTSDBInstanceDataTagValueListResponse.InstanceId"));

		List<Data> tagValueList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ExploreHiTSDBInstanceDataTagValueListResponse.TagValueList.Length"); i++) {
			Data data = new Data();
			data.setTagValue(_ctx.stringValue("ExploreHiTSDBInstanceDataTagValueListResponse.TagValueList["+ i +"].TagValue"));

			tagValueList.add(data);
		}
		exploreHiTSDBInstanceDataTagValueListResponse.setTagValueList(tagValueList);
	 
	 	return exploreHiTSDBInstanceDataTagValueListResponse;
	}
}