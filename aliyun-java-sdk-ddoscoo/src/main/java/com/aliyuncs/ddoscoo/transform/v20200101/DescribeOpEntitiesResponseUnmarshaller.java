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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeOpEntitiesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeOpEntitiesResponse.OpEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpEntitiesResponseUnmarshaller {

	public static DescribeOpEntitiesResponse unmarshall(DescribeOpEntitiesResponse describeOpEntitiesResponse, UnmarshallerContext _ctx) {
		
		describeOpEntitiesResponse.setRequestId(_ctx.stringValue("DescribeOpEntitiesResponse.RequestId"));
		describeOpEntitiesResponse.setTotalCount(_ctx.longValue("DescribeOpEntitiesResponse.TotalCount"));

		List<OpEntity> opEntities = new ArrayList<OpEntity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOpEntitiesResponse.OpEntities.Length"); i++) {
			OpEntity opEntity = new OpEntity();
			opEntity.setGmtCreate(_ctx.longValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].GmtCreate"));
			opEntity.setEntityType(_ctx.integerValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].EntityType"));
			opEntity.setEntityObject(_ctx.stringValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].EntityObject"));
			opEntity.setOpAction(_ctx.integerValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].OpAction"));
			opEntity.setOpAccount(_ctx.stringValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].OpAccount"));
			opEntity.setOpDesc(_ctx.stringValue("DescribeOpEntitiesResponse.OpEntities["+ i +"].OpDesc"));

			opEntities.add(opEntity);
		}
		describeOpEntitiesResponse.setOpEntities(opEntities);
	 
	 	return describeOpEntitiesResponse;
	}
}