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

package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.GetLibraryResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetLibraryResponse.Library;
import com.aliyuncs.cloudphoto.model.v20170711.GetLibraryResponse.Library.AutoCleanConfig;
import com.aliyuncs.cloudphoto.model.v20170711.GetLibraryResponse.Library.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLibraryResponseUnmarshaller {

	public static GetLibraryResponse unmarshall(GetLibraryResponse getLibraryResponse, UnmarshallerContext context) {
		
		getLibraryResponse.setRequestId(context.stringValue("GetLibraryResponse.RequestId"));
		getLibraryResponse.setCode(context.stringValue("GetLibraryResponse.Code"));
		getLibraryResponse.setMessage(context.stringValue("GetLibraryResponse.Message"));
		getLibraryResponse.setAction(context.stringValue("GetLibraryResponse.Action"));

		Library library = new Library();

		Quota quota = new Quota();
		quota.setTotalQuota(context.longValue("GetLibraryResponse.Library.Quota.TotalQuota"));
		quota.setTotalTrashQuota(context.longValue("GetLibraryResponse.Library.Quota.TotalTrashQuota"));
		quota.setFacesCount(context.integerValue("GetLibraryResponse.Library.Quota.FacesCount"));
		quota.setPhotosCount(context.integerValue("GetLibraryResponse.Library.Quota.PhotosCount"));
		quota.setUsedQuota(context.longValue("GetLibraryResponse.Library.Quota.UsedQuota"));
		quota.setVideosCount(context.integerValue("GetLibraryResponse.Library.Quota.VideosCount"));
		quota.setActiveSize(context.longValue("GetLibraryResponse.Library.Quota.ActiveSize"));
		quota.setInactiveSize(context.longValue("GetLibraryResponse.Library.Quota.InactiveSize"));
		library.setQuota(quota);

		AutoCleanConfig autoCleanConfig = new AutoCleanConfig();
		autoCleanConfig.setAutoCleanEnabled(context.booleanValue("GetLibraryResponse.Library.AutoCleanConfig.AutoCleanEnabled"));
		autoCleanConfig.setAutoCleanDays(context.integerValue("GetLibraryResponse.Library.AutoCleanConfig.AutoCleanDays"));
		library.setAutoCleanConfig(autoCleanConfig);
		getLibraryResponse.setLibrary(library);
	 
	 	return getLibraryResponse;
	}
}