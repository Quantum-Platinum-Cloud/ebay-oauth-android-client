/*
 * Copyright 2019 eBay Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ebay.api.client.auth.oauth2

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.ebay.api.client.auth.oauth2.internal.DeepLinkHelper

/**
 * Helper class that validates eBay native app is installed on the device that can handle uri or intent provided
 */
class EbayAppHelper(context: Context) {

    private val deepLinkHelper = DeepLinkHelper(context)

    public fun iseBayAppInstalled(uri: Uri): Boolean = iseBayAppInstalled(Intent(Intent.ACTION_VIEW, uri))

    public fun iseBayAppInstalled(intent: Intent) : Boolean = deepLinkHelper.verifyEbayDeepLink(intent)
}