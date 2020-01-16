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

import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataTagKeyListResponse;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataTagKeyListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreHiTSDBInstanceDataTagKeyListResponseUnmarshaller {

	public static ExploreHiTSDBInstanceDataTagKeyListResponse unmarshall(ExploreHiTSDBInstanceDataTagKeyListResponse exploreHiTSDBInstanceDataTagKeyListResponse, UnmarshallerContext _ctx) {
		
		exploreHiTSDBInstanceDataTagKeyListResponse.setRequestId(_ctx.stringValue("ExploreHiTSDBInstanceDataTagKeyListResponse.RequestId"));
		exploreHiTSDBInstanceDataTagKeyListResponse.setInstanceId(_ctx.stringValue("ExploreHiTSDBInstanceDataTagKeyListResponse.InstanceId"));

		List<Data> tagKeyList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ExploreHiTSDBInstanceDataTagKeyListResponse.TagKeyList.Length"); i++) {
			Data data = new Data();
			data.setTagKey(_ctx.stringValue("ExploreHiTSDBInstanceDataTagKeyListResponse.TagKeyList["+ i +"].TagKey"));

			tagKeyList.add(data);
		}
		exploreHiTSDBInstanceDataTagKeyListResponse.setTagKeyList(tagKeyList);
	 
	 	return exploreHiTSDBInstanceDataTagKeyListResponse;
	}
}