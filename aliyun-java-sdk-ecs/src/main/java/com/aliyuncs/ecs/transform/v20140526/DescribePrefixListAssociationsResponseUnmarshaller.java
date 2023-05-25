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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribePrefixListAssociationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePrefixListAssociationsResponse.PrefixListAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrefixListAssociationsResponseUnmarshaller {

	public static DescribePrefixListAssociationsResponse unmarshall(DescribePrefixListAssociationsResponse describePrefixListAssociationsResponse, UnmarshallerContext _ctx) {
		
		describePrefixListAssociationsResponse.setRequestId(_ctx.stringValue("DescribePrefixListAssociationsResponse.RequestId"));
		describePrefixListAssociationsResponse.setNextToken(_ctx.stringValue("DescribePrefixListAssociationsResponse.NextToken"));

		List<PrefixListAssociation> prefixListAssociations = new ArrayList<PrefixListAssociation>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrefixListAssociationsResponse.PrefixListAssociations.Length"); i++) {
			PrefixListAssociation prefixListAssociation = new PrefixListAssociation();
			prefixListAssociation.setResourceId(_ctx.stringValue("DescribePrefixListAssociationsResponse.PrefixListAssociations["+ i +"].ResourceId"));
			prefixListAssociation.setResourceType(_ctx.stringValue("DescribePrefixListAssociationsResponse.PrefixListAssociations["+ i +"].ResourceType"));

			prefixListAssociations.add(prefixListAssociation);
		}
		describePrefixListAssociationsResponse.setPrefixListAssociations(prefixListAssociations);
	 
	 	return describePrefixListAssociationsResponse;
	}
}