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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryLazyLoadProgressResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryLazyLoadProgressResponseUnmarshaller {

	public static InnerQueryLazyLoadProgressResponse unmarshall(InnerQueryLazyLoadProgressResponse innerQueryLazyLoadProgressResponse, UnmarshallerContext context) {
		
		innerQueryLazyLoadProgressResponse.setRequestId(context.stringValue("InnerQueryLazyLoadProgressResponse.RequestId"));
		innerQueryLazyLoadProgressResponse.setTotalCount(context.integerValue("InnerQueryLazyLoadProgressResponse.TotalCount"));

		List<DiskLazyLoadProgress> diskLazyLoadProgressSet = new ArrayList<DiskLazyLoadProgress>();
		for (int i = 0; i < context.lengthValue("InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgressSet.Length"); i++) {
			DiskLazyLoadProgress diskLazyLoadProgress = new DiskLazyLoadProgress();
			diskLazyLoadProgress.setMax(context.integerValue("InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgressSet["+ i +"].Max"));
			diskLazyLoadProgress.setValue(context.integerValue("InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgressSet["+ i +"].Value"));
			diskLazyLoadProgress.setFinished(context.booleanValue("InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgressSet["+ i +"].Finished"));
			diskLazyLoadProgress.setDiskId(context.stringValue("InnerQueryLazyLoadProgressResponse.DiskLazyLoadProgressSet["+ i +"].DiskId"));

			diskLazyLoadProgressSet.add(diskLazyLoadProgress);
		}
		innerQueryLazyLoadProgressResponse.setDiskLazyLoadProgressSet(diskLazyLoadProgressSet);
	 
	 	return innerQueryLazyLoadProgressResponse;
	}
}