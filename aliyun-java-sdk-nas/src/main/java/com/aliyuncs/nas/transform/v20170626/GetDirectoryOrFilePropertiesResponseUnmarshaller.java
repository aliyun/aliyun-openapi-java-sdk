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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.GetDirectoryOrFilePropertiesResponse;
import com.aliyuncs.nas.model.v20170626.GetDirectoryOrFilePropertiesResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDirectoryOrFilePropertiesResponseUnmarshaller {

	public static GetDirectoryOrFilePropertiesResponse unmarshall(GetDirectoryOrFilePropertiesResponse getDirectoryOrFilePropertiesResponse, UnmarshallerContext _ctx) {
		
		getDirectoryOrFilePropertiesResponse.setRequestId(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.RequestId"));

		Entry entry = new Entry();
		entry.setType(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.Type"));
		entry.setInode(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.Inode"));
		entry.setStorageType(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.StorageType"));
		entry.setATime(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.ATime"));
		entry.setSize(_ctx.longValue("GetDirectoryOrFilePropertiesResponse.Entry.Size"));
		entry.setHasInfrequentAccessFile(_ctx.booleanValue("GetDirectoryOrFilePropertiesResponse.Entry.HasInfrequentAccessFile"));
		entry.setCTime(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.CTime"));
		entry.setRetrieveTime(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.RetrieveTime"));
		entry.setMTime(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.MTime"));
		entry.setName(_ctx.stringValue("GetDirectoryOrFilePropertiesResponse.Entry.Name"));
		getDirectoryOrFilePropertiesResponse.setEntry(entry);
	 
	 	return getDirectoryOrFilePropertiesResponse;
	}
}