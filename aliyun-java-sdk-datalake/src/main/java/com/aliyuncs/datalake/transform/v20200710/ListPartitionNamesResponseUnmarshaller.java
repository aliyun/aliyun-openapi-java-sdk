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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListPartitionNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPartitionNamesResponseUnmarshaller {

	public static ListPartitionNamesResponse unmarshall(ListPartitionNamesResponse listPartitionNamesResponse, UnmarshallerContext _ctx) {
		
		listPartitionNamesResponse.setRequestId(_ctx.stringValue("ListPartitionNamesResponse.RequestId"));
		listPartitionNamesResponse.setMessage(_ctx.stringValue("ListPartitionNamesResponse.Message"));
		listPartitionNamesResponse.setNextPageToken(_ctx.stringValue("ListPartitionNamesResponse.NextPageToken"));
		listPartitionNamesResponse.setCode(_ctx.stringValue("ListPartitionNamesResponse.Code"));
		listPartitionNamesResponse.setSuccess(_ctx.booleanValue("ListPartitionNamesResponse.Success"));

		List<String> partitionNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListPartitionNamesResponse.PartitionNames.Length"); i++) {
			partitionNames.add(_ctx.stringValue("ListPartitionNamesResponse.PartitionNames["+ i +"]"));
		}
		listPartitionNamesResponse.setPartitionNames(partitionNames);
	 
	 	return listPartitionNamesResponse;
	}
}