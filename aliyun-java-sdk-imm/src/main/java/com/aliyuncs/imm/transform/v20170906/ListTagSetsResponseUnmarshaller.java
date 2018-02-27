/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListTagSetsResponse;
import com.aliyuncs.imm.model.v20170906.ListTagSetsResponse.SetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagSetsResponseUnmarshaller {

	public static ListTagSetsResponse unmarshall(ListTagSetsResponse listTagSetsResponse, UnmarshallerContext context) {
		
		listTagSetsResponse.setRequestId(context.stringValue("ListTagSetsResponse.RequestId"));
		listTagSetsResponse.setNextMarker(context.stringValue("ListTagSetsResponse.NextMarker"));

		List<SetsItem> sets = new ArrayList<SetsItem>();
		for (int i = 0; i < context.lengthValue("ListTagSetsResponse.Sets.Length"); i++) {
			SetsItem setsItem = new SetsItem();
			setsItem.setSetId(context.stringValue("ListTagSetsResponse.Sets["+ i +"].SetId"));
			setsItem.setStatus(context.stringValue("ListTagSetsResponse.Sets["+ i +"].Status"));
			setsItem.setPhotos(context.longValue("ListTagSetsResponse.Sets["+ i +"].Photos"));
			setsItem.setCreateTime(context.stringValue("ListTagSetsResponse.Sets["+ i +"].CreateTime"));
			setsItem.setModifyTime(context.stringValue("ListTagSetsResponse.Sets["+ i +"].ModifyTime"));

			sets.add(setsItem);
		}
		listTagSetsResponse.setSets(sets);
	 
	 	return listTagSetsResponse;
	}
}