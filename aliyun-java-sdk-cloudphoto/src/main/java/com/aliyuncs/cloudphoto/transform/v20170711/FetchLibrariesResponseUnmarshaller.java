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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.FetchLibrariesResponse;
import com.aliyuncs.cloudphoto.model.v20170711.FetchLibrariesResponse.Library;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchLibrariesResponseUnmarshaller {

	public static FetchLibrariesResponse unmarshall(FetchLibrariesResponse fetchLibrariesResponse, UnmarshallerContext context) {
		
		fetchLibrariesResponse.setRequestId(context.stringValue("FetchLibrariesResponse.RequestId"));
		fetchLibrariesResponse.setCode(context.stringValue("FetchLibrariesResponse.Code"));
		fetchLibrariesResponse.setMessage(context.stringValue("FetchLibrariesResponse.Message"));
		fetchLibrariesResponse.setTotalCount(context.integerValue("FetchLibrariesResponse.TotalCount"));
		fetchLibrariesResponse.setAction(context.stringValue("FetchLibrariesResponse.Action"));

		List<Library> libraries = new ArrayList<Library>();
		for (int i = 0; i < context.lengthValue("FetchLibrariesResponse.Libraries.Length"); i++) {
			Library library = new Library();
			library.setLibraryId(context.stringValue("FetchLibrariesResponse.Libraries["+ i +"].LibraryId"));
			library.setCtime(context.longValue("FetchLibrariesResponse.Libraries["+ i +"].Ctime"));

			libraries.add(library);
		}
		fetchLibrariesResponse.setLibraries(libraries);
	 
	 	return fetchLibrariesResponse;
	}
}