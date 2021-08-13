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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagVbrRelationsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagVbrRelationsResponse.SagVbrRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagVbrRelationsResponseUnmarshaller {

	public static DescribeSagVbrRelationsResponse unmarshall(DescribeSagVbrRelationsResponse describeSagVbrRelationsResponse, UnmarshallerContext _ctx) {
		
		describeSagVbrRelationsResponse.setRequestId(_ctx.stringValue("DescribeSagVbrRelationsResponse.RequestId"));

		List<SagVbrRelation> sagVbrRelations = new ArrayList<SagVbrRelation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagVbrRelationsResponse.SagVbrRelations.Length"); i++) {
			SagVbrRelation sagVbrRelation = new SagVbrRelation();
			sagVbrRelation.setVbrInstanceId(_ctx.stringValue("DescribeSagVbrRelationsResponse.SagVbrRelations["+ i +"].VbrInstanceId"));
			sagVbrRelation.setSagUid(_ctx.stringValue("DescribeSagVbrRelationsResponse.SagVbrRelations["+ i +"].SagUid"));
			sagVbrRelation.setSagInstanceId(_ctx.stringValue("DescribeSagVbrRelationsResponse.SagVbrRelations["+ i +"].SagInstanceId"));

			sagVbrRelations.add(sagVbrRelation);
		}
		describeSagVbrRelationsResponse.setSagVbrRelations(sagVbrRelations);
	 
	 	return describeSagVbrRelationsResponse;
	}
}