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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeAllDBInstanceClassResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeAllDBInstanceClassResponse.ClassCodeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllDBInstanceClassResponseUnmarshaller {

	public static DescribeAllDBInstanceClassResponse unmarshall(DescribeAllDBInstanceClassResponse describeAllDBInstanceClassResponse, UnmarshallerContext _ctx) {
		
		describeAllDBInstanceClassResponse.setRequestId(_ctx.stringValue("DescribeAllDBInstanceClassResponse.RequestId"));

		List<ClassCodeListItem> classCodeList = new ArrayList<ClassCodeListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllDBInstanceClassResponse.ClassCodeList.Length"); i++) {
			ClassCodeListItem classCodeListItem = new ClassCodeListItem();
			classCodeListItem.setClassCode(_ctx.stringValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].ClassCode"));
			classCodeListItem.setCpuCores(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].CpuCores"));
			classCodeListItem.setMemoryInGB(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].MemoryInGB"));
			classCodeListItem.setDefaultStorageInGB(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].DefaultStorageInGB"));
			classCodeListItem.setMinStorageInGB(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].MinStorageInGB"));
			classCodeListItem.setMaxStorageInGB(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].MaxStorageInGB"));
			classCodeListItem.setStepStorageInGB(_ctx.longValue("DescribeAllDBInstanceClassResponse.ClassCodeList["+ i +"].StepStorageInGB"));

			classCodeList.add(classCodeListItem);
		}
		describeAllDBInstanceClassResponse.setClassCodeList(classCodeList);
	 
	 	return describeAllDBInstanceClassResponse;
	}
}